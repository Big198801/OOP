package lesson_07.Ex004;

public class Robot1 {
    /**уровень робота */
    public int level;
    /**Имя робота */
    public String name;


    /**
     * Создание робота
     * @param name Имя робота !!Не должно начинаться с цифры
     * @param level Уровень робота
     */
    public Robot1(String name, int level)
    {
        this.name = name;
        this.level = level;
    }
    public void startBIOS() {System.out.println("Start BIOS... ");}

    public void startOS() {System.out.println("Start OS... ");}

    public void sayHi() {System.out.println("Hello World... ");}

    public void stopBIOS() {System.out.println("Stop BIOS... ");}

    public void stopOS() {System.out.println("Stop OS... ");}

    public void sayBye(){System.out.println("Bye... ");}

    public void work(){System.out.println("Workink... ");}
}
