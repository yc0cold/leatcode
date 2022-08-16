public class FindPivotIndex {
    public int pivotIndex(int[] nums){
        int [] rightArray = new int[nums.length];
        int [] leftArray = new int[nums.length];
        int sum1 = 0;
        int sum2 = 0;

        // accumulated sum array(from left to right)
        for(int i=0; i<nums.length; i++){
            sum1+=nums[i];
            rightArray[i] = sum1;
        }

        // accumulated sum array(from right to left)
        for(int j=0; j<nums.length; j++){
            sum2+=nums[nums.length-j-1];
            leftArray[j] = sum2;
        }

        // exception if pivot is left tip
        if(nums[0] == leftArray[nums.length-1]){
            return 0;
        }

        // find pivot of making the sums of right and left equal
        for(int i=0; i<rightArray.length; i++){
            for(int j=0; j<leftArray.length; j++){
                if(rightArray[i] == leftArray[j] && (i+1)+(j+1)+1==nums.length){
                    return i+1;
                }
            }
        }

        // exception if pivot is right tip
        if(nums[nums.length-1] == rightArray[nums.length-1]){
            return nums.length-1;
        }else return -1;
    }
}
