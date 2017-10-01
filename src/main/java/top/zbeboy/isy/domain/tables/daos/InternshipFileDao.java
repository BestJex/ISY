/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.isy.domain.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import top.zbeboy.isy.domain.tables.InternshipFile;
import top.zbeboy.isy.domain.tables.records.InternshipFileRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class InternshipFileDao extends DAOImpl<InternshipFileRecord, top.zbeboy.isy.domain.tables.pojos.InternshipFile, Record2<String, String>> {

    /**
     * Create a new InternshipFileDao without any configuration
     */
    public InternshipFileDao() {
        super(InternshipFile.INTERNSHIP_FILE, top.zbeboy.isy.domain.tables.pojos.InternshipFile.class);
    }

    /**
     * Create a new InternshipFileDao with an attached configuration
     */
    @Autowired
    public InternshipFileDao(Configuration configuration) {
        super(InternshipFile.INTERNSHIP_FILE, top.zbeboy.isy.domain.tables.pojos.InternshipFile.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<String, String> getId(top.zbeboy.isy.domain.tables.pojos.InternshipFile object) {
        return compositeKeyRecord(object.getInternshipReleaseId(), object.getFileId());
    }

    /**
     * Fetch records that have <code>internship_release_id IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.InternshipFile> fetchByInternshipReleaseId(String... values) {
        return fetch(InternshipFile.INTERNSHIP_FILE.INTERNSHIP_RELEASE_ID, values);
    }

    /**
     * Fetch records that have <code>file_id IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.InternshipFile> fetchByFileId(String... values) {
        return fetch(InternshipFile.INTERNSHIP_FILE.FILE_ID, values);
    }
}
