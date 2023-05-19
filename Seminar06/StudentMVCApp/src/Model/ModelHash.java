package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import Controller.igetModel;
import View.ViewEng;
/** Класс для создания хранилища HashMap */
public class ModelHash implements igetModel {
   /**статичное поле с хранилищем */
    private static HashMap<Long, Student> students;
    /**
     * конструктор класса
     * @param students принимает тип HashMap
     */
    public ModelHash(HashMap<Long, Student> students) {
        this.students = students;
    }
    
    
   /**
    * метод для удаления студента с хранилища
    * @param id принимает параметр с номером клиента для удаления
    */ 
    public static  void deleteStudentBy(Long id){
        if(students.containsKey(id)){
            students.remove(id);
            System.out.println("----student deleted successfully-----");
        }
        else{
            System.out.println("-----student not found------");
        }
    }

   /** метод для получения списка студентов из хранилища  */
    public List<Student> getAllStudent() {
        List<Student>studLs = new ArrayList<Student>();
        for (var student : students.entrySet()) {
            studLs.add(student.getValue());    
        }
        return studLs;
    }


    /** дублирующий метод */
    @Override
    public void deleteStudentByid(Long id) {
        this.deleteStudentBy(id);
    }

    
    



    
}
