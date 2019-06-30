package service.impl;

import dao.AssessmentDao;
import dao.impl.AssessmentDaoImpl;
import service.AssessmentService;

public class AssessmentServiceImpl implements AssessmentService {

    private static AssessmentService instance;

    private AssessmentDao assessmentDao = AssessmentDaoImpl.getInstance();

    private AssessmentServiceImpl() {

    }

    public static AssessmentService getInstance() {
        if (instance == null) {
            instance = new AssessmentServiceImpl();
        }
        return instance;
    }

}
