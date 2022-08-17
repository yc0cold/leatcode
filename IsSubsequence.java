import java.util.ArrayList;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {

        // t should be longer than s
        if(s.length() > t.length()){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            int idx = isInString(t, s.charAt(i));
            if(idx == -1){
                return false;
            }else{
                // create new String starting from index where the character in s was found + 1
                t = t.substring(idx+1);
            }
            System.out.println("t = " + t);
        }
        return true;
    }

    // check if a character is in String t, return the index of the character
    public static int isInString(String t, Character ch){
        for(int i=0; i<t.length(); i++){
            if(ch == t.charAt(i)){
                System.out.println("i = " + i);
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        boolean result = isSubsequence("abc","ahbgdc");
        System.out.println("result = " + result);
    }
}
