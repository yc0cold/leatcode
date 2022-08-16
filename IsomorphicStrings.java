import java.util.ArrayList;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {

        ArrayList<Character>charArrayList1 = new ArrayList<>();
        ArrayList<Character>charArrayList2 = new ArrayList<>();

        int[] intS = new int[s.length()];
        int[] intT = new int[t.length()];

        int chk1 = 0;
        int chk2 = 0;
        for(int i=0; i<s.length(); i++){
            chk1 = checkInArray(charArrayList1, s.charAt(i));
            if(chk1 == -1){
                charArrayList1.add(s.charAt(i));
                intS[i] = i;
            }else{
                intS[i] = chk1;
            }
        }

        for(int j=0; j<t.length(); j++){
            chk2 = checkInArray(charArrayList2, t.charAt(j));
            if(chk2 == -1){
                charArrayList2.add(s.charAt(j));
                intT[j] = j;
            }else{
                intT[j] = chk2;
            }
        }
/*

        for(int i=0; i<intS.length; i++){
            System.out.println("intS = " + intS[i]);
        }
        for(int i=0; i<intS.length; i++){
            System.out.println("intT = " + intT[i]);
        }
*/

        for(int k=0; k<intS.length; k++){
            if(intS[k]-intT[k] != 0){
                return false;
            }
        }
        return true;

    }

    public static int checkInArray(ArrayList<Character> arr, Character ch){

        if(arr.size() == 0){return -1;}

        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) == ch){
                return i;
            }
        }

        return -1;
    }
    
    public static void main(String[] args){
        String s = "foo";
        String t = "bar";

        boolean answer = isIsomorphic(s,t);
        System.out.println("answer = " + answer);
    }
}
