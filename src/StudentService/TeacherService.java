package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Teacher;
import StudentDomen.UserComparator;

public class TeacherService implements iUserService<Teacher> {
    private List<Teacher> teachers;
    private int count;

    public TeacherService(){
        this.teachers = new ArrayList<Teacher>();
    }

    public int getCountOfTeachers(){
        return count;
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;

    }
    

  
    public List<Teacher> getSortedByFIOStudentGroup() {
        List<Teacher> teachs = new ArrayList<>(teachers);
        teachs.sort(new UserComparator<Teacher>());
        return teachs;
    }

    
    public void create(String firstName, String secondName, int age, String academicDegree) {
        Teacher teach = new Teacher(firstName, secondName, age, academicDegree);
        count++;
        teachers.add(teach);
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Teacher teach = new Teacher(firstName, secondName, age, secondName);
        count++;
        teachers.add(teach);
    }
    
}