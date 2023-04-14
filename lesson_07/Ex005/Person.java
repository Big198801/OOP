package lesson_07.Ex005;

public class Person {
    String name;
    int age;
    public String adress;
    public String phone;
    Person(){
        this("неизвестно", 0, "неизвестно", "неизвестно");
    }
    Person(String n){
        this(n, 0, "неизвестно", "неизвестно");
    }
    public Person(String Name, int Age, String adr, String phonNum){
        this.name = Name;
        this.age = Age;
        this.adress = adr;
        this.phone = phonNum;
    }
    public void setAge(int age) {
        if (age > 0 && age < 110)
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }

    void displayAllInfo(){
        System.out.printf("Имя: %s, \tВозраст: %d, Адрес: %s,\tНомер телефона: %s\n", name, age, adress, phone);
    }
    void sayHi(){
        System.out.println("\tПривет," + " " + name + "!)");

    }
   
    
   
}
