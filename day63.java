import java.util.ArrayList;
import java.util.List;

public class day63 {
    public static void pattern(int N, List<Integer> list , int count ){
        if(N==count){
            return;
        }
        list.add(N);
        if(N>0){
            pattern(N-5, list);
        }
        else if(N<=0){
            pattern(N+5, list);
        }


    }

   
}
