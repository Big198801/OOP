package Controller;

import java.util.List;

import Model.Student;
/** Интерфейс для работы MVC */
public interface iGetView {
    void printAllStudens(List<Student> students);

    String prompt(String message);
}
