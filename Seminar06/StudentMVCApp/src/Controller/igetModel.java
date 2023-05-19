package Controller;

import java.util.List;

import Model.Student;

public interface igetModel {
    public List<Student> getAllStudent();
    void deleteStudentByid(Long id);
} 
