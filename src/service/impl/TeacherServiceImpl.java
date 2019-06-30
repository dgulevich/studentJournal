package service.impl;

import dao.TeacherDao;
import dao.impl.TeacherDaoImpl;
import service.TeacherService;

public class TeacherServiceImpl implements TeacherService {

    private static TeacherService instance;

    private TeacherDao teacherDao = TeacherDaoImpl.getInstance();

    private TeacherServiceImpl() {

    }

    public static TeacherService getInstance() {
        if (instance == null) {
            instance = new TeacherServiceImpl().getInstance();
        }
        return instance;
    }
}
