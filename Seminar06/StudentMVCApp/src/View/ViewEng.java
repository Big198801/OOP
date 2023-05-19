package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

public class ViewEng implements iGetView{

    public void printAllStudens(List<Student> studens){
        System.out.println("-----Printing all Students-----");
        for (Student person : studens) {
            System.out.println(person);
        }
        System.out.println("----Printing is done-----");

    }

    public String prompt(String message){
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }

    public Long promptDel(){
        Scanner in = new Scanner(System.in);
        System.out.println("choose student ID you looking for delete: ");
        return in.nextLong();
    }

    
    public void deleteSuccessful() {
        System.out.println("deleted succesfully");
    }
    

}