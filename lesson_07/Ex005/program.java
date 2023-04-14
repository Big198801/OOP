package lesson_07.Ex005;

public class program {
   public static void main(String[] args) {
    Person human1 = new Person();
    human1.name = "Коля";
    human1.adress = "Чебоксары";
    human1.phone = "+7917584356";
    human1.setAge(33);
    
    
    human1.sayHi();
    human1.displayAllInfo();

    Person human2 = new Person();
    human2.sayHi();
    human2.displayAllInfo();
    Person human3 = new Person();
    human3.sayHi();
    human3.displayAllInfo();

    
   


   } 
  
}
