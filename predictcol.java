public class predictcol {
    int columnWithMaxZeros(int arr[][], int N)
    {
        int n = arr.length;
        int temp = 0 ;
        int idx = 0 ;
        for(int j = 0 ;j<n;j++){
            int count = 0 ;
            for(int i = 0 ; i<n;i++ ){
                if(arr[i][j]==0){
                    count++;
                }
            }
            if(count>temp){
                temp = count;
                idx = j ;
            }
            if(j==n-1&&temp==0){
                return -1;
            }
        }
        return idx;
    }
}
