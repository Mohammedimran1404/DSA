package DSA;

import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] nums={-4,1,0,10};
//        o/p is int[] nums={0,1,16,100};
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
