public class smith {
    static int smithNum(int n) {
        // code here
        if(prime(n)) return 0;
        if(digitSum(n)==compositeFactors(n)) return 1;
        return 0;
    }
    public static int digitSum(int temp){
        int sum1=0;
        while(temp>0){
            int digit=temp%10;
            sum1+=digit;
            temp=temp/10;
        }
        return sum1;
    }
    public static int compositeFactors(int n){
        int currSum=0;
        int i=2;
        while(n>1){
            while(n>1&&n%i==0){
                n=n/i;
                if(prime(i)){
                    int sum=digitSum(i);
                    currSum+=sum;
                }
            }
            i++;
        }
        return currSum;
    }
    public static boolean prime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }

   
}
