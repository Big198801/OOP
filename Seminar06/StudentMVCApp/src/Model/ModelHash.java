package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import Controller.igetModel;
import View.ViewEng;

public class ModelHash implements igetModel {
   
    private static HashMap<Long, Student> students;

    public ModelHash(HashMap<Long, Student> students) {
        this.students = students;
    }
    
    
   
    public static  void deleteStudentBy(Long id){
        if(students.containsKey(id)){
            students.remove(id);
            
            System.out.println("----student deleted successfully-----");
        }
        else{
            System.out.println("-----student not found------");
        }
    }

   
    public List<Student> getAllStudent() {
        List<Student>studLs = new ArrayList<Student>();
        for (var student : students.entrySet()) {
            studLs.add(student.getValue());    
        }
        return studLs;
    }



    @Override
    public void deleteStudentByid(Long id) {
        this.deleteStudentBy(id);
    }

    
    



    
}
