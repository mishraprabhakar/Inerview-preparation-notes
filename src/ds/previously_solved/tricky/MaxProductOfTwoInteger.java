package ds.previously_solved.tricky;

public class MaxProductOfTwoInteger {
    public static void main(String[] args) {
        int[] a = {10,80,30,40,50, 10, 20};

        System.out.println(maxProduct(a));
    }

    public static Integer maxProduct(int[] a){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : a) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        return max1 * max2;
    }

}
