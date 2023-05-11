package StudentDomen;

public class Teacher extends User {
    private String profession;
    public Teacher(String firstName, String secondName, int age, String profession) {
        super(firstName, secondName, age);
        this.profession = profession;
    }

    public void setProfession(String profession){
        this.profession= profession;
    }

    public String getProfesion(){
        return this.profession;
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getSecondName() {
        return super.getSecondName();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public void setSecondName(String secondName) {
        super.setSecondName(secondName);
    }

    @Override
    public String toString() {
        return "Teacher {" 
        + "firstName = " + super.getFirstName()
        + ", secondName = " + super.getSecondName()
        + ", age = " + super.getAge()+ 
        ", profession = " + this.profession + '}';
    }
    
}
