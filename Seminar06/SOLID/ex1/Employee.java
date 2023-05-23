package ex1;

public class Employee extends CalculateNetSalary {
    private String name;
    // private Date dob;
    private int baseSalary;


    /* метод для получения baseSalary */
    @Override
    public int getBaseSalary() {

        return this.getBaseSalary();
    }

    public Employee(String name, /* Date dob, */ int baseSalary) {
        this.name = name;
        // this.dob = dob;
        this.baseSalary = baseSalary;
    }

    @Override
    public int calculateNetSalary() {
        return (int) (getBaseSalary() - (getBaseSalary() * 0.25));
    }
    
    public String getEmpInfo() {
        return "name - " + name + " , dob - "/* + dob.toString() */ ;
    }

}
