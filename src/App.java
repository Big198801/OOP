import StudentDomen.AverageAge;
import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.Teacher;
import StudentService.EmploeeService;
import StudentService.StudentService;
import StudentService.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {
    
        StudentService studServ = new StudentService();
        studServ.create("Валентина", "Никитина", 22);
        studServ.create("Николай", "Афанасьев", 35);
        studServ.create("Владимир", "Карюканов", 39);
        studServ.create("Алексей", "Пахарев", 35);
        System.out.println("Список студентов:");
        System.out.println(studServ.getAll());
        System.out.println("=============После сортировки==============");
        System.out.println(studServ.getSortedByFIOStudentGroup());
        AverageAge<Student> averageAgeOfStudents = new AverageAge<>(studServ.getAll());
        System.out.println("Средний возраст студентов: " + averageAgeOfStudents.calculateAverageAge());
        
        
        EmploeeService servEmp = new EmploeeService();
        servEmp.create("Сергей", "Шегуров", 35);
        servEmp.create("Александр", "Матросов", 41);
        servEmp.create("Станислав", "Архипов", 39);
        servEmp.create("Светлана", "Иванова", 43);
        System.out.println("Список работников:");
        System.out.println(servEmp.getAll());
        System.out.println("=============После сортировки==============");
        System.out.println(servEmp.getSortedByFIOStudentGroup());
        AverageAge<Emploee> averageAgeOfEmploee = new AverageAge<>(servEmp.getAll());
        System.out.println("Средний возраст работников: " + averageAgeOfEmploee.calculateAverageAge());


        TeacherService servTeach = new TeacherService();
        servTeach.create("Антонина", "Селиванова", 45, "научный руководитель");
        servTeach.create("Ольга", "Губанова", 49, "учитель");
        servTeach.create("Алиса", "Николаева", 52, "учитель");
        servTeach.create("Петр", "Иванов", 62, "Музыкант");
        System.out.println("Список преподавателей:");
        System.out.println(servTeach.getAll());
        System.out.println("===========После сортировки================");
        System.out.println(servTeach.getSortedByFIOStudentGroup());
        AverageAge<Teacher> averageAgeOfTeachers = new AverageAge<>(servTeach.getAll());
        System.out.println("Средний возраст преподавателей: " + averageAgeOfTeachers.calculateAverageAge());


    }
}

    
    
    
    
    
    
