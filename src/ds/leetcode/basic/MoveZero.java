package ds.leetcode.basic;

public class MoveZero {
    public static void main(String[] args) {
        int[] ints = {0,2,0,0,0,0,0,0,0, 0, 0, 1, 0, 3};
//        int[] ints = {0};

        int[] ans = moveZero(ints);
        for (int i : ints) {
            System.out.print(i+" ");
        }
    }

    private static int[] moveZero(int[] nums) {

//        for (int i = 0; i < ints.length -1 ; i++) {
//
//            if (ints[i] == 0 && ints[i + 1] != 0) {
//                int temp = ints[i];
//                ints[i] = ints[i+1];
//                ints[i+1] = temp;
//            } else if (ints[i] == 0 && ints[i + 1] == 0 && i < ints.length-2) {
//                int temp = ints[i];
//                ints[i] = ints[i+2];
//                ints[i+2] = temp;
//            }
//        }

        int i = 0;
        for (int num : nums)
        {
            if (num != 0)
            {
                nums[i] = num;
                i++;
            }
        }

        while (i <= nums.length - 1)
        {
            nums[i] = 0;
            i++;
        }

        return nums;
    }
}
