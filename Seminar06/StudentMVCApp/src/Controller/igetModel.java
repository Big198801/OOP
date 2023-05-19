package Controller;

import java.util.List;

import Model.Student;

/**Интрефейс для работы с MVC */
public interface igetModel {
    public List<Student> getAllStudent();
    void deleteStudentByid(Long id);
} 
