public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {

        for (int i = 0; i < s.length()/2; i++) {
            int n = 1;
            while((i+1) * n < s.length()){
                if(s.substring(0,i+1).equals(s.substring((i+1)*n,(i+1)*(n+1)))){
                    n++;
                }
                else{
                    break;
                }
            }

            if((i+1) * n == s.length()){
                return true;
            }
        }

        return false;

        // 2. Easiest way
//        String doubled = s + s;
//        String sub = doubled.substring(1, doubled.length() - 1);
//        System.out.println("sub = " + sub);
//        return sub.contains(s);
    }

    public static void main(String[] args) {
        String s = "aabaabc";
        RepeatedSubstringPattern r = new RepeatedSubstringPattern();
        boolean answer = r.repeatedSubstringPattern(s);

        System.out.println("answer = " + answer);
    }
}
