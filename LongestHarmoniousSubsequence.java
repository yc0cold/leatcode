import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        int max = 0;
        int output = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }
        System.out.println("map = " + map);
        int [] keyArr = new int[map.size()];
        int i=0;
        for(int key : map.keySet()){
            System.out.println("key = " + key);
            keyArr[i] = key;
            i++;
        }
        Arrays.sort(keyArr);
        for (int j = 0; j < keyArr.length - 1; j++) {
            int temp = 0;
            if(Math.abs(keyArr[j] - keyArr[j+1]) == 1){
                temp = map.get(keyArr[j]) + map.get(keyArr[j+1]);
                if(temp > max) max = temp;
            }
        }
        if(keyArr.length == 2){
            if(Math.abs(keyArr[0] - keyArr[1]) == 1){
                max = map.get(keyArr[0]) + map.get(keyArr[1]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        LongestHarmoniousSubsequence ls = new LongestHarmoniousSubsequence();

        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};

        ls.findLHS(nums);
    }
}
