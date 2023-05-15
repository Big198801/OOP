package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.UserComparator;

public class StudentService implements iUserService<Student> {
    private int count;
    private List<Student> students;
    
    public StudentService() {
        this.students = new ArrayList<Student>();
    }


    @Override
    public void create(String firstName, String secondName, int age) {
        Student person = new Student(firstName, secondName, age, count);
        count++;
        students.add(person);
    }


    @Override
    public List<Student> getAll() {
        
        return students;
    }

    public List<Student> getSortedByFIOStudentGroup() {
        List<Student> teachs = new ArrayList<>(students);
        teachs.sort(new UserComparator<Student>());
        return teachs;
    }

    
    }

