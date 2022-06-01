package daily;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
    	// "flower","flow","flight"
    	

        if(strs.length == 1){ return strs[0]; }
        
    	String s = strs[0];
    	int checker = strs.length-1;
        
    	for(int j = strs[0].length(); j > 0 ; j--) {
    		s = s.substring(0,j);
    		for(int i = 1; i < strs.length; i++) {
        		
        		if(strs[i].contains(s) && strs[i].indexOf(s) == 0) {
        			checker --;
        			
        			continue;
        		}else {
        			checker = strs.length-1;
        			break;
        		}
        	}
    		
			if( checker == 0 ) {
				break;
			}
    	}
    	
        if( checker == strs.length-1 ){
            s = "";
        }

    	return s;
    }
	
}
