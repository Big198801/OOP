package Controllers;

import StudentDomen.Emploee;
import StudentService.TeacherService;


public class TeacherController implements iUserController<Emploee> {
    private final TeacherService teachService = new TeacherService();


    @Override
    public void create(String firstName, String secondName, int age) {
      teachService.create(firstName, secondName, age);  
    }

    public void create(String firstName, String secondName, int age, String academicDegree) {
        teachService.create(firstName, secondName, age, academicDegree);
    }
}
    

