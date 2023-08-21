import java.util.Arrays;

public class RemoveDuplicatefromSortedArary {
    public int removeDuplicates(int[] nums) {
        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;

    }

    public static void main(String[] args) {
        RemoveDuplicatefromSortedArary r = new RemoveDuplicatefromSortedArary();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        r.removeDuplicates(nums);
    }
}
