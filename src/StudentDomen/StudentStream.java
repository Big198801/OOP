package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup>{
    public List<StudentGroup> stream;

    public StudentStream(List <StudentGroup> stream){
    this.stream = stream;
    }

    public List<StudentGroup> getGroup(){
        return stream;
    }
    //public void ad(List <StudentGroup> groups){
    //    stream.add();
    //}
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
