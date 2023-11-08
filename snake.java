import java.util.ArrayList;

public class snake {
    public static ArrayList matrix(int arr[][]){
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i<n;i++){
            // row = i
            if(i%2==1){
                // right to left
                for(int j = n-1;j>=0;j--){
                     list.add(arr[i][j]);
                }

            }
            else{
                // left to right
                for(int j = 0 ; j<n;j++){
                    list.add(arr[i][j]);
                }

            }
        }
        return list;
    }
}
