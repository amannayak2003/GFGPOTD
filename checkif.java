public class checkif {
    public static boolean isRotated(String str1, String str2)
    {
        if(str1.length()!=str2.length()){
            return false;
        }
        
        String s=str1+str1;
        
        //anticlockwise
        String s1=s.substring(2, str1.length()+2);
        // clockwise 
        String s2=s.substring(str1.length()-2, s.length()-2);
        
        if(str2.equals(s1) || str2.equals(s2)){
            return true;
        }
        
        
        return false;
    }
}
