package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.UserComparator;

public class StudentGroupService {
    private List<StudentGroup> groups;

    public StudentGroupService() {
        this.groups = new ArrayList<StudentGroup>();
    }


    public List<StudentGroup> getAll(){
        return groups;
    }

    public  List<Student> getSortedByFIOStudentGroup(int numberGroup){
        List<Student> students = new ArrayList<Student>(groups.get(numberGroup).getStudent());
        students.sort(new UserComparator<Student>());
        return students;

    }
}

