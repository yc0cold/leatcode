import java.util.HashSet;

public class LongestPalindrome {
    // 409.LongestPalindrome
    // category: greedy algorithm
    // Level: Easy
    public static int longestPalindrome(String s) {

        String str = null;
        int oddCount = 0; // if all the elements are even, return the number of elements in String
        int result = 1;

        // if all the elements of String is same, return the length of the String
        if(allSameCheck(s) == true){
            return s.length();
        }
        for(int i=0; i<s.length(); i++){
            str = s.substring(0,i+1);
            if(addCheck(str, s.charAt(i))){
                result += 2;
                oddCount --;
            }else{
                oddCount ++;
            }
        }
        return oddCount == 0 ? s.length() : result;
    }

    // if an element is in the String (checker1) and the number of the element in the String is even, plus 2
    public static boolean addCheck(String str, Character ch){
        boolean checker1 = false;
        int count = 0;
        boolean checker2 = false;
        for(int i=0; i<str.length(); i++){
            if(ch == str.charAt(i)){
                checker1 = true;
                count ++;
            }
        }
        checker2 = count%2==0 ? true : false;

        return checker1 && checker2 == true ? true : false;
    }

    public static boolean allSameCheck(String str){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != str.charAt(0)){
                return false;
            }
        }
        return true;
    }

    // using hashMap is more convenient and easy
    // src: https://leetcode.com/problems/longest-palindrome/discuss/1598987/409.-Longest-Palindrome%3A-Java-Solution
    public int longestPalindrome2(String s) {
        if (s == null || s.length() == 0){
            return 0;
        }
        HashSet<Character> hs = new HashSet<Character>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (hs.contains(s.charAt(i))) {
                hs.remove(s.charAt(i));
                count++;
            } else {
                hs.add(s.charAt(i));
            }
        }
        if (!hs.isEmpty()){
            return count * 2 + 1;
        }
        return count * 2;
    }

    public static void main(String[] args){
        String s = "tattarrattat";
        longestPalindrome(s);
    }
}
