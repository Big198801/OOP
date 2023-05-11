package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup  implements Iterable<Student>, Comparable<StudentGroup>{
    private List<Student> student;
    private long groupId;
    
    public StudentGroup(List<Student> student, long groupId) {
        this.student = student;
        this.groupId = groupId;
        
    }

    public long getId(){
        return groupId;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudents(List<Student> student) {
        this.student = student;
    }
    
    //2 задание. итератор для вывода на консоль
    @Override
    public Iterator<Student> iterator() {
        return  new Iterator<Student>() {
            int counter= 0;
            @Override
            public boolean hasNext() {
                return counter < student.size();
            }
        
            @Override
            public Student next() {
                if (!hasNext()){
                    return null;
                }
                
                return student.get(counter++);
                
            }
        };
    }

    // 3 задание. comparator. сравнение по количеству студентов
    @Override
    public int compareTo(StudentGroup o) {
        if (this.student.size() == o.getStudent().size()) {
            return 0;
        }
        if (this.student.size() < o.getStudent().size()) {
            return -1;
        }
        return 1;
        
        
    }

   

    

    
}
