package service.impl;

import dao.SubjectDao;
import dao.impl.SubjectDaoImpl;
import service.SubjectService;

public class SubjectServiceImpl implements SubjectService {

    private static SubjectService instance;

    private SubjectDao subjectDao = SubjectDaoImpl.getInstance();

    private SubjectServiceImpl() {

    }

    public static SubjectService getInstance() {
        if (instance == null) {
            instance = new SubjectServiceImpl();
        }
        return instance;
    }
}
