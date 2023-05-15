package Controllers;

import StudentDomen.Emploee;
import StudentService.EmploeeService;

public class EmploeeController implements iUserController<Emploee> {
    private final EmploeeService empService = new EmploeeService();


    @Override
    public void create(String firstName, String secondName, int age) {
        empService.create(firstName, secondName, age);
    }

    static public <T extends Emploee> void paySalary(T person){
        System.out.println(person.getFirstName()+ " выплачено 10 тыс\n");
    }

    static public <T extends Number> Double mean(T[] num){
        double sum = 0.0;
        for (int i = 0; i < num.length; i++) {
         sum += num[i].doubleValue();   
        }
        return sum/num.length;
    }
    
}
