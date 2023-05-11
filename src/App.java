import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentStream;
import StudentDomen.Teacher;
import StudentDomen.User;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Третье ДЗ готово)\n");

    User u1 = new User("sergey", "Ivanov" ,25);
    Student s1 = new Student("Oleg", "Ivashin", 25, (long)101);
    Student s2 = new Student("Aleksey", "Tolstoy", 24, (long)111);
    Student s3 = new Student("Alex", "Tolstov", 22, (long)112);
    Student s4 = new Student("Egor", "Krivov", 23, (long)113);
    Student s5 = new Student("Igor", "Vlasov", 26, (long)114);
    Student s6 = new Student("Olya", "Ilina", 25, (long)101001);
    Student s7 = new Student("Alya", "Tolkina", 29, (long)134211);
    Student s8 = new Student("Alexandra", "Tolstovka", 33, (long)115452);
    Student s9 = new Student("ivanka", "Pirogov", 43, (long)113323);
    Student s10 = new Student("Ignat", "Pegov", 27, (long)114565);
    Student s11 = new Student("Ig", "Popov", 29, (long)1145125);
    Teacher t1 = new Teacher("Jack", "Nickolaev", 45, "phisics");

    List<Student>listStud = new ArrayList<>();
    listStud.add(s1);
    listStud.add(s2);
    listStud.add(s3);
    listStud.add(s4);
    listStud.add(s5);
    listStud.add(s6);

    StudentGroup group_1 = new StudentGroup(listStud, 1000);
    System.out.printf("\nНомер группы: %s\nсписок студентов:\n",group_1.getId());
    for (Student students : group_1) {
        System.out.println(students);
    }
    
    List<Student>listStud_2 = new ArrayList<>();
    listStud_2.add(s7);
    listStud_2.add(s8);
    listStud_2.add(s9);
    listStud_2.add(s10);
    listStud_2.add(s11);

    StudentGroup group_2 = new StudentGroup(listStud_2, 1001);
    System.out.printf("\nНомер группы: %s\nсписок студентов:\n",group_2.getId());
    for (Student students : group_2) {
        System.out.println(students);
    }
    
    List<StudentGroup> list_potok1 = new ArrayList<StudentGroup>();
    list_potok1.add(group_1);
    list_potok1.add(group_2);
    StudentStream potok1 = new StudentStream(list_potok1);

    //сортировка по кол-ву студентов
    Collections.sort(potok1.getGroup());
    
    System.out.println("\n\n___группа с меньшим количеством студентов выводится в первую очередь_____");
    for (StudentGroup studentGroup : potok1) {
        System.out.printf("Номер группы: %d\nКоличество студентов: %d\n", studentGroup.getId() ,studentGroup.getStudent().size() );       
        for (Student stud : studentGroup) {
            System.out.println(stud);
        }
    }
    }
}

    
    
    
    
    
    
