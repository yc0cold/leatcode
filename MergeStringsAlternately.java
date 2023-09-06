public class MergeStringsAlternately {
    /* leetcode #1768 #String #Two Pointers */
    public String mergeAlternately(String word1, String word2) {
        int p1 = 0;
        int p2 = 0;
        String str = "";

        while(p1 != word1.length() || p2 != word2.length()){
            if(p1 != word1.length()){
                str += word1.charAt(p1);
                p1++;
            }
            if(p2 != word2.length()){
                str += word2.charAt(p2);
                p2++;
            }

        }
        return str;
    }
}
