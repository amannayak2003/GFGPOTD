public interface day62 {
    public static void shuffle(int a[],int n){
            int mod = 1001;
            for(int i = 0; i < n / 2; i++){
                a[i * 2] += (a[i] % mod) * mod;
                a[i * 2 + 1] += (a[i + n / 2] % mod) * mod;
            }
            
            for(int i = 0; i < n; i++){
                a[i] /= mod;
            }

    }
}
