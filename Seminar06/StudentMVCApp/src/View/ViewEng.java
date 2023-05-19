package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;
/** Класс View на вывода на английском языке
 * имплементирует поведение интерфейса iGetView
 */
public class ViewEng implements iGetView{
    /** построчный вывод студентов на консоль из списка */
    public void printAllStudens(List<Student> studens){
        System.out.println("-----Printing all Students-----");
        for (Student person : studens) {
            System.out.println(person);
        }
        System.out.println("----Printing is done-----");

    }
    /**метод для получения выбранной команды на чтение/удаление из списка */
    public String prompt(String message){
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
    /**
     * измененый метод для получения номера студента для удаления из списка
     * @return возвращает выбранный номер
     */
    public Long promptDel(){
        Scanner in = new Scanner(System.in);
        System.out.println("choose student ID you looking for delete: ");
        return in.nextLong();
    }

    
    

}