import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int k = m+n-1;

        while(p2 >= 0){
            if(p1 >= 0 && nums1[p1] > nums2[p2]){
                nums1[k--] = nums1[p1--];
            }else{

                nums1[k--] = nums2[p2--];
            }
        }
        
        System.out.println("Arrays.toString(nums1) = " + Arrays.toString(nums1));
//        int idx1 = 0, idx2 = 0;
//        Queue<Integer> q = new LinkedList<>();
//        for(int i=0; i<m; i++){
//            q.offer(nums1[i]);
//        }
//        System.out.println("q = " + q);
//        while(q.size() > 0 || idx2 < n){
//            System.out.println("q = " + q);
//            System.out.println("idx1 = " + idx1);
//            System.out.println("idx2 = " + idx2);
//            System.out.println("q.peek() = " + q.peek());
//            System.out.println("nums2[idx2] = " + nums2[idx2]);
//            if(idx2 == n){
//                nums1[idx1] = q.poll();
//                idx1 ++;
//                continue;
//            }
//            if(q.size() == 0){
//                nums1[idx1] = nums2[idx2];
//                idx1 ++;
//                idx2 ++;
//                continue;
//            }
//
//            if(q.peek() <= nums2[idx2]){
//                nums1[idx1] = q.poll();
//            }else{
//                nums1[idx1] = nums2[idx2];
//                idx2 ++;
//            }
//            idx1++;
//            System.out.println("Arrays.toString(nums1) = " + Arrays.toString(nums1));
//
//        }

    }

    public static void main(String[] args) {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(nums1,m,nums2,n);
    }
}
