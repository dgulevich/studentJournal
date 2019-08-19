package main.java;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import main.java.domain.*;
import main.java.service.*;
import main.java.service.impl.*;

public class Main {

    private final AssessmentService assessmentService;
    private final ClassroomService classroomService;
    private final PupilService pupilService;
    private final SubjectService subjectService;
    private final TeacherService teacherService;

    public Main() {
        this.assessmentService = AssessmentServiceImpl.getInstance();
        this.classroomService = ClassroomServiceImpl.getInstance();
        this.pupilService = PupilServiceImpl.getInstance();
        this.subjectService = SubjectServiceImpl.getInstance();
        this.teacherService = TeacherServiceImpl.getInstance();
    }

    public static void main(String[] args) {
        final Main main = new Main();
        main.assessmentService.deleteAll();
        main.classroomService.deleteAll();
        main.pupilService.deleteAll();
        main.subjectService.deleteAll();
        main.teacherService.deleteAll();

        Subject sGeography = new Subject(1L, "geography");
        Subject sBiology = new Subject(1L, "biology");
        Subject sMath = new Subject(1L, "math");
        main.subjectService.save(sGeography);
        main.subjectService.save(sBiology);
        main.subjectService.save(sMath);
        main.subjectService.getAll().forEach(System.out::println);

        main.teacherService.save(new Teacher(1L, "Ivanov Ivan Ivanovich",
                35, 500, "teacher", sGeography));
        main.teacherService.save(new Teacher(1L, "Petrov Peter Petrovich",
                42, 610, "teacher", sBiology));
        main.teacherService.save(new Teacher(1L, "Fedorov Fedor Fedorovich",
                38, 580, "teacher", sMath));
        main.teacherService.getAll().forEach(System.out::println);

        Classroom classroom11A = new Classroom(1L, "11 A");
        Classroom classroom11B = new Classroom(1L, "11 B");
        Classroom classroom11C = new Classroom(1L, "11 C");
        main.classroomService.save(classroom11A);
        main.classroomService.save(classroom11B);
        main.classroomService.save(classroom11C);
        main.classroomService.getAll().forEach(System.out::println);

        main.pupilService.save(new Pupil(1L, "Andreev Andrey", 16, classroom11A ));
        main.pupilService.save(new Pupil(2L, "Matveev Matvey", 15, classroom11A));
        main.pupilService.save(new Pupil(2L, "Aleksandrov Alexandr", 15, classroom11B));
        main.pupilService.getAll().forEach(System.out::println);
        System.out.println("--------------");
        main.pupilService.getByClassroom(classroom11A).forEach(System.out::println);
    }
}
