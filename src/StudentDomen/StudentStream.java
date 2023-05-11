package StudentDomen;

import java.util.Iterator;
import java.util.List;
/**
 * 1 задание. создан класс, описывающий поток клиентов, состоящий из групп. Наследует интерфейс Iterable
 */
public class StudentStream implements Iterable<StudentGroup>{
    public List<StudentGroup> stream;

    public StudentStream(List <StudentGroup> stream){
    this.stream = stream;
    }

    public List<StudentGroup> getGroup(){
        return stream;
    }
    
    @Override
    public Iterator<StudentGroup> iterator() {
        return  new Iterator<StudentGroup>() {
            int counter= 0;
            @Override
            public boolean hasNext() {
                return counter < stream.size();
            }
        
            @Override
            public StudentGroup next() {
                if (!hasNext()){
                    return null;
                }
                
                return stream.get(counter++);
                
            }

            
        };
    }

   
    
}
