package service.impl;

import dao.ClassroomDao;
import dao.impl.ClassroomDaoImpl;
import service.ClassroomService;

public class ClassroomServiceImpl implements ClassroomService {

    private static ClassroomService instance;

    private ClassroomDao classroomDao = ClassroomDaoImpl.getInstance();

    private ClassroomServiceImpl() {

    }

    public static ClassroomService getInstance() {
        if (instance == null) {
            instance = new ClassroomServiceImpl();
        }
        return instance;
    }
}
