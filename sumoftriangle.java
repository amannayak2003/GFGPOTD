import java.util.ArrayList;

public class sumoftriangle {
    static ArrayList<Integer> sumTriangles(int arr[][], int n){
    ArrayList<Integer> list = new ArrayList<>();
            int count1 = 0 ;
            int count2 = 0 ;
            for(int i = 0 ; i<n;i++){
                for(int j = 0 ; j<n;j++){
                    if(i<=j){
                        count1+=arr[i][j];
                    }
                    if(i>=j){
                        count2+=arr[i][j];
                    }
                }
            }
            list.add(count1);
            list.add(count2);
            return list;

}
}