import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class isomorphic {
    public static boolean isomorphicc(String str1,String str2){
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Boolean> map2 = new HashMap<>();
        
        if(str1.length()!=str2.length()){
            return false;
        }

        for(int i = 0 ; i<str1.length();i++){
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if(map1.containsKey(ch1)){
                if(map1.get(ch1)!=ch2){
                    return false;
                }
            }
            else{
                if(map2.containsKey(ch2)==true){
                    return false;
                }
                else{
                    map1.put(ch1, ch2);
                    map2.put(ch2, true);
                }
            }
        }
        return true;

    }

    

    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "xxxz";
        System.out.println(isomorphicc(str1, str2));
    }
}
