package Controller;

import java.util.ArrayList;
import java.util.List;
import Model.ModelHash;
import Model.Student;
import View.ViewEng;

/** Класс, связующий ViewEng и ModelHash */
public class Controller extends ViewEng {
    private List<Student> studens;
    private igetModel model;
    private iGetView view;
    /**
     * Конструктор, принимает
     * @param view экземпляр класса содержащего интерфейс iGetView
     * @param model экхемпляр класса содержащего интерфейс igetModel
     */
    public Controller(iGetView view, igetModel model) {
        this.view = view;
        this.model = model;
        this.studens = new ArrayList<Student>();

    }

    public boolean testData() {
        if (studens.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void getAllStudent() {
        studens = model.getAllStudent();
    }

    public void updateView() {
        // MVP
        getAllStudent();
        if (testData()) {
            view.printAllStudens(studens);
        } else {
            System.out.println("список студентов пуст");
        }

        // MVC
        // view.printAllStudens(model.getAllStuden());
    }

    public void run() {
        Command com = Command.NONE;
        boolean getNewIteration = true;

        while (getNewIteration) {
            String command = view.prompt("Input your Choice: ");
            com = Command.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Exit...");
                    break;
                case LIST:
                    getAllStudent();
                    updateView();
                    break;
                case DELETE:
                    getAllStudent();
                    Long id = promptDel();
                    ModelHash.deleteStudentBy(id);
                    break;
                default:

                    break;
            }
        }

    }

}