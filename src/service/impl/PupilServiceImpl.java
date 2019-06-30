package service.impl;

import dao.PupilDao;
import dao.impl.PupilDaoImpl;
import service.PupilService;

public class PupilServiceImpl implements PupilService {

    private static PupilService instance;

    private PupilDao pupilDao = PupilDaoImpl.getInstance();

    private PupilServiceImpl() {

    }

    public static PupilService getInstance() {
        if (instance == null) {
            instance = new PupilServiceImpl();
        }
        return instance;
    }
}
