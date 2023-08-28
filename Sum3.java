import java.util.*;

public class Sum3 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int j = i+1;
            int k = nums.length-1;

            if(nums[i] == nums[i+1]) continue;

            while (j < k) {

                while(j < k && nums[j] == nums[j+1]){
                    j++;
                }
                while (j < k && nums[k] == nums[k - 1]) {
                    k--;
                }

                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    answer.add(Arrays.asList(nums[i], nums[j], nums[k]));
                }else if(sum < 0 ){
                    j++;
                }else{
                    k--;
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};

        Sum3 s = new Sum3();
        s.threeSum(nums);

    }
}
