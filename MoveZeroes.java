public class MoveZeroes {
    public void moveZeroes(int[] nums) {

        // #1. set an index to change with non-zero item, and increment whenever nums[i] is non-zero and change zero with non-zero item.

        // int indexToChange = 0;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] != 0){
        //         int temp = nums[indexToChange];
        //         nums[indexToChange] = nums[i];
        //         nums[i] = temp;

        //         indexToChange ++;
        //     }
        // }

        // #2. Drag all the non-zero item into the front, and fill in zero for the rest of spot
        int indexToInsert = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[indexToInsert] = nums[i];
                indexToInsert ++;
            }
        }

        while(indexToInsert <= nums.length-1){
            nums[indexToInsert] = 0;
            indexToInsert++;
        }
    }

}
