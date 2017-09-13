/**
 * Created by zbeboy on 2017/7/19.
 */
require(["jquery", "handlebars", "messenger", "jquery.address", "jquery.simple-pagination", "jquery.showLoading", "bootstrap"],
    function ($, Handlebars) {

        /*
         ajax url.
         */
        var ajax_url = {
            release_data_url: '/anyone/graduate/design/release/data',
            group_url: '/web/graduate/design/reorder/groups',
            arrange_url: '/web/graduate/design/reorder/arrange',
            arrange_condition: '/web/graduate/design/reorder/arrange/condition',
            order_url: '/web/graduate/design/reorder/order'
        };

        /*
         参数
         */
        var param = {
            searchParams: '',
            pageNum: 0,
            pageSize: 2,
            displayedPages: 3
        };

        /*
         参数id
         */
        var paramId = {
            graduationDesignTitle: '#search_title'
        };

        var tableData = '#tableData';
        var groupDataNode = '#groupData';

        function startLoading() {
            // 显示遮罩
            $('#page-wrapper').showLoading();
        }

        function endLoading() {
            // 去除遮罩
            $('#page-wrapper').hideLoading();
        }

        /*
         清空参数
         */
        function cleanParam() {
            $(paramId.graduationDesignTitle).val('');
        }

        /**
         * 刷新查询参数
         */
        function refreshSearch() {
            var params = {
                graduationDesignTitle: $(paramId.graduationDesignTitle).val()
            };
            param.pageNum = 0;
            param.searchParams = JSON.stringify(params);
        }

        /*
         搜索
         */
        $('#search').click(function () {
            refreshSearch();
            init();
        });

        /*
         重置
         */
        $('#reset_search').click(function () {
            cleanParam();
            refreshSearch();
            init();
        });

        $('#refresh').click(function () {
            init();
        });

        $(paramId.graduationDesignTitle).keyup(function (event) {
            if (event.keyCode === 13) {
                refreshSearch();
                init();
            }
        });

        /**
         * 列表数据
         * @param data 数据
         */
        function listData(data) {
            var template = Handlebars.compile($("#graduation-design-template").html());

            Handlebars.registerHelper('graduation_design_title', function () {
                return new Handlebars.SafeString(Handlebars.escapeExpression(this.graduationDesignTitle));
            });

            Handlebars.registerHelper('school_name', function () {
                return new Handlebars.SafeString(Handlebars.escapeExpression(this.schoolName));
            });

            Handlebars.registerHelper('college_name', function () {
                return new Handlebars.SafeString(Handlebars.escapeExpression(this.collegeName));
            });

            Handlebars.registerHelper('department_name', function () {
                return new Handlebars.SafeString(Handlebars.escapeExpression(this.departmentName));
            });

            Handlebars.registerHelper('science_name', function () {
                return new Handlebars.SafeString(Handlebars.escapeExpression(this.scienceName));
            });

            Handlebars.registerHelper('real_name', function () {
                return new Handlebars.SafeString(Handlebars.escapeExpression(this.realName));
            });

            $(tableData).html(template(data));
        }

        /**
         * 组数据
         * @param data 数据
         */
        function groupData(data) {
            var template = Handlebars.compile($("#group-template").html());

            Handlebars.registerHelper('text', function () {
                var v = '组员: ' + this.memberName.join(',');
                return new Handlebars.SafeString(Handlebars.escapeExpression(v));
            });

            $(groupDataNode).html(template(data));
        }

        /*
         安排
         */
        $(tableData).delegate('.design_reorder_arrange', "click", function () {
            var id = $(this).attr('data-id');
            $.post(web_path + ajax_url.arrange_condition, {id: id}, function (data) {
                if (data.state) {
                    $.address.value(ajax_url.arrange_url + '?id=' + id);
                } else {
                    Messenger().post({
                        message: data.msg,
                        type: 'error',
                        showCloseButton: true
                    });
                }
            });
        });

        /*
         答辩
         */
        $(tableData).delegate('.design_reorder_reply', "click", function () {
            var id = $(this).attr('data-id');
            $.post(web_path + ajax_url.group_url, {id: id}, function (data) {
                if (data.state) {
                    groupData(data);
                    $('#graduationDesignReleaseId').val(id);
                    $('#groupModal').modal('show');
                } else {
                    Messenger().post({
                        message: data.msg,
                        type: 'error',
                        showCloseButton: true
                    });
                }
            });
        });

        var to_group = false;
        var to_group_id = '';

        $('#groupModal').on('hidden.bs.modal', function (e) {
            // do something...
            if (to_group) {
                to_group = false;
                var graduationDesignReleaseId = $('#graduationDesignReleaseId').val();
                $.address.value(ajax_url.order_url + '?id=' + graduationDesignReleaseId + '&defenseGroupId=' + to_group_id);
            }
        });

        /*
         安排
         */
        $(groupDataNode).delegate('.selectGroup', "click", function () {
            to_group_id = $(this).attr('data-id');
            to_group = true;
            $('#groupModal').modal('hide');
        });

        init();

        /**
         * 初始化数据
         */
        function init() {
            startLoading();
            $.get(web_path + ajax_url.release_data_url, param, function (data) {
                endLoading();
                createPage(data);
                listData(data);
            });
        }

        /**
         * 创建分页
         * @param data 数据
         */
        function createPage(data) {
            $('#pagination').pagination({
                pages: data.paginationUtils.totalPages,
                displayedPages: data.paginationUtils.displayedPages,
                hrefTextPrefix: '',
                prevText: '上一页',
                nextText: '下一页',
                cssStyle: '',
                listStyle: 'pagination',
                onPageClick: function (pageNumber, event) {
                    // Callback triggered when a page is clicked
                    // Page number is given as an optional parameter
                    console.log(pageNumber);
                    nextPage(pageNumber);
                }
            });
        }

        /**
         * 下一页
         * @param pageNumber 当前页
         */
        function nextPage(pageNumber) {
            param.pageNum = pageNumber;
            startLoading();
            $.get(web_path + ajax_url.release_data_url, param, function (data) {
                endLoading();
                listData(data);
            });
        }

    });