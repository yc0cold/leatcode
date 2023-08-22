import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

//        Queue<Integer> q = new LinkedList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] != val){
//                q.offer(nums[i]);
//                k++;
//            }
//        }
//        int n = q.size();
//        for (int i = 0; i < n; i++) {
//            nums[i] = q.poll();
//        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        RemoveElement re = new RemoveElement();
        re.removeElement(nums, val);
    }
}
