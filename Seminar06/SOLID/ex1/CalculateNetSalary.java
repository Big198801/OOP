package ex1;

public class CalculateNetSalary {
   
    private int baseSalary;
    
    /** 
     * @return возврат базовой ЗП
     */
    public int getBaseSalary(){
        return this.baseSalary;
    }

    /**
     * @return возвращает результат netSalary
     */
    public int calculateNetSalary() {
      return  (int)(getBaseSalary() - (getBaseSalary() * 0.25));
    }
}
