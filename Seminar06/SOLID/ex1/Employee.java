package ex1;
public class Employee extends CalculateNetSalary {
    private String name;
    //private Date dob;
    private int baseSalary;

    public Employee(String name, /*Date dob,*/ int baseSalary) {
        this.name = name;
        //this.dob = dob;
        this.baseSalary = baseSalary;
    }

    @Override
    public int calculateNetSalary(int baseSalary) {
        return (int)(baseSalary - (baseSalary * 0.25)) ;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - "/*+ dob.toString() */ ;
    }

    

}
