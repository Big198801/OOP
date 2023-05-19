import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.Controller;
import Controller.iGetView;
import Controller.igetModel;
import Model.FileRepo;
import Model.ModelHash;
import Model.Student;
import View.ViewEng;

public class App {
    public static void main(String[] args) throws Exception {
       Student s1 = new Student("kwerwrewrweolya", "Afa", 34, 1);
       Student s2 = new Student("olya", "Afa", 32, 2);
       Student s3 = new Student("tolya", "Afa", 33, 3);
       //List<Student> studList = new ArrayList<Student>();
       //studList.add(s1);
       //studList.add(s2);
       //studList.add(s3);
       HashMap<Long, Student> hashStudents = new HashMap<>();
       hashStudents.put(s1.getStudentId(), s1);
       hashStudents.put(s2.getStudentId(), s2);
       hashStudents.put(s3.getStudentId(), s3);

       //FileRepo fileRepo = new FileRepo("StudentsDb.txt");
       //for (var pers : hashStudents.entrySet()) {
       //     fileRepo.addStudent(pers.getValue());
       //}
       //fileRepo.saveAllStudentstoFile();
       igetModel model  = new ModelHash(hashStudents);

       //igetModel modeFileRepo = fileRepo;


       iGetView view = new ViewEng();
       Controller controller = new Controller(view, model);
       controller.run();
       //controller.updateView();
    }
}
