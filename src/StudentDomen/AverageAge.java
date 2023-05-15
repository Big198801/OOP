package StudentDomen;

import java.util.List;

public class AverageAge<T extends User> {
    
    private List<T> persons;
  
    public AverageAge(List<T> persons) {
      this.persons = persons;
    }
  
    public int calculateAverageAge() {
      int sum = 0;
      for (T person : persons) {
        sum += person.getAge();
      }
      return sum / persons.size();
    }
  }
