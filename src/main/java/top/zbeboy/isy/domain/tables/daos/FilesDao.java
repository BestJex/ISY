/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.isy.domain.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import top.zbeboy.isy.domain.tables.Files;
import top.zbeboy.isy.domain.tables.records.FilesRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class FilesDao extends DAOImpl<FilesRecord, top.zbeboy.isy.domain.tables.pojos.Files, String> {

    /**
     * Create a new FilesDao without any configuration
     */
    public FilesDao() {
        super(Files.FILES, top.zbeboy.isy.domain.tables.pojos.Files.class);
    }

    /**
     * Create a new FilesDao with an attached configuration
     */
    @Autowired
    public FilesDao(Configuration configuration) {
        super(Files.FILES, top.zbeboy.isy.domain.tables.pojos.Files.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(top.zbeboy.isy.domain.tables.pojos.Files object) {
        return object.getFileId();
    }

    /**
     * Fetch records that have <code>file_id IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.Files> fetchByFileId(String... values) {
        return fetch(Files.FILES.FILE_ID, values);
    }

    /**
     * Fetch a unique record that has <code>file_id = value</code>
     */
    public top.zbeboy.isy.domain.tables.pojos.Files fetchOneByFileId(String value) {
        return fetchOne(Files.FILES.FILE_ID, value);
    }

    /**
     * Fetch records that have <code>size IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.Files> fetchBySize(String... values) {
        return fetch(Files.FILES.SIZE, values);
    }

    /**
     * Fetch records that have <code>original_file_name IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.Files> fetchByOriginalFileName(String... values) {
        return fetch(Files.FILES.ORIGINAL_FILE_NAME, values);
    }

    /**
     * Fetch records that have <code>new_name IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.Files> fetchByNewName(String... values) {
        return fetch(Files.FILES.NEW_NAME, values);
    }

    /**
     * Fetch records that have <code>relative_path IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.Files> fetchByRelativePath(String... values) {
        return fetch(Files.FILES.RELATIVE_PATH, values);
    }

    /**
     * Fetch records that have <code>ext IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.Files> fetchByExt(String... values) {
        return fetch(Files.FILES.EXT, values);
    }
}
