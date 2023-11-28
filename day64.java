import java.util.ArrayList;

public class day64 {
   
    int sumOfDependencies(ArrayList<ArrayList<Integer>> adj, int V) {
        int res = 0;
       for(ArrayList<Integer> list : adj){
           res+=list.size();
       }
       return res;
   }
}
