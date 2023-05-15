package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Emploee;
import StudentDomen.UserComparator;

public class EmploeeService implements iUserService<Emploee> {
    private int count;
    private List<Emploee> emploees;
    
    public EmploeeService() {
        this.emploees = new ArrayList<Emploee>();
    }


    public List<Emploee> getEmploees() {
        return emploees;
    }


    public void setEmploees(List<Emploee> emploees) {
        this.emploees = emploees;
    }


    @Override
    public void create(String firstName, String secondName, int age) {
       Emploee per = new Emploee(firstName, secondName, age, count);
       count++;
       emploees.add(per);
        
    }


    @Override
    public List<Emploee> getAll() {
        // TODO Auto-generated method stub
        return emploees;
    }

    public  List<Emploee> getSortedByFIOStudentGroup(){
        List<Emploee> emps = new ArrayList<Emploee>(emploees);
        emps.sort(new UserComparator<>());
        return emps;
        

    }

   
}
