import com.exceptions.EmptyArrayException;

import java.util.List;

public class Calculator {
    public void sum(List<Integer> list) throws EmptyArrayException {

            if(list.size()==0){
                throw new EmptyArrayException("Please enter non empty array");
            }
            int sum = 0 ;
            for (int i = 0; i <list.size() ; i++) {
                sum = sum + list.get(i);
            }
            System.out.println(sum);


    }
}
