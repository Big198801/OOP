package StudentDomen;



public class Teacher extends User implements Comparable<Teacher>{
    private String academicDegree;

    public Teacher(String firstName, String secondName, int age, String academicDegree) {
        super(firstName, secondName, age);    
        this.academicDegree = academicDegree;
    }


    public String getTeacherId() {
        return academicDegree;
    }

    public void setTeacherId(String academicDegree) {
        this.academicDegree = academicDegree;
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
        return " Teacher {" 
        + "firstName = " + super.getFirstName()
        + ", secondName = " + super.getSecondName()
        + ", age = " + super.getAge()+ 
        "}\n";
    }

    @Override
    public int compareTo(Teacher o) {
        if (this.getAge() == o.getAge()) {
            return 0;
        }
        if (this.getAge() > o.getAge()) {
            return 1;
        }
        return -1;
    }
    
}
