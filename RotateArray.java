import java.util.Arrays;

public class RotateArray {

    public void rotate(int[] nums, int k) {
        int[] new_nums = new int[nums.length];
        int n = nums.length;

        for (int i=0; i<n; i++) {
            System.out.println("i+k%n = " + i+k%n);
            if(i+k%n > n-1){
                new_nums[i+k%n - n] = nums[i];
            }else{
                new_nums[i%n + k%n] = nums[i];
            }
        }
        for(int i=0; i<new_nums.length; i++){
            nums[i] = new_nums[i];
        }
        System.out.println("Arrays.toString(new_nums) = " + Arrays.toString(new_nums));
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums_1 = {1, 2, 3, 4, 5, 6, 7};
        int k_1 = 3;
        int[] nums_2 = {-1, -100, 3, 99};
        int k_2 = 2;

        RotateArray ra = new RotateArray();
        ra.rotate(nums_1, k_1);
    }
}
