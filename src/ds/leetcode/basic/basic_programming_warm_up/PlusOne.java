package ds.leetcode.basic.basic_programming_warm_up;

public class PlusOne {
    public static void main(String[] args) {
//        int[] numbers = {9,8,7,6,5,4,3,2,9,9};
        int[] numbers = {9,9,9,9,9,9,9};
//        int[] numbers = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,9,9,9};

        int[] ans = plusOne(numbers);

        for (int i : ans) {
            System.out.print(i+" ");
        }
    }

    private static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
    /*Less Efficient Solution*/

//    private static int[] plusOne(int[] numbers) {
//
//        long len = numbers.length;
//        StringBuilder str = new StringBuilder();
//        int i =0;
//
//        while (len !=0 ) {
//            str.append(numbers[i]);
//            i++;
//            len--;
//        }
//
//        int length = str.length();
//        StringBuilder sb = new StringBuilder();
//        int carry = 0;
//
//        String string = str.toString();
//
//        while (length != 0) {
//
//            int val = Integer.parseInt(String.valueOf(string.charAt(length-1)));
//
//            if ((length == string.length() || carry == 1) && val == 9) {
//                sb.append(0);
//                carry = 1;
//                length--;
//            } else if ((length == string.length() && val < 9)){
//                sb.append(Integer.sum(val, 1));
//                length--;
//            } else if (length == 0 && carry == 1) {
//                sb.append(1);
//            } else {
//                sb.append(Integer.sum(val,carry));
//                carry = 0;
//                length--;
//            }
//        }
//
//        if (carry==1)
//            sb.append(1);
//
//        String reverse = String.valueOf(sb.reverse());
//
//        int[] answer = new int[reverse.length()];
//        int counter = 0;
//
//        for (char c : reverse.toCharArray()) {
//            int num =Integer.parseInt(String.valueOf(c));
//            answer[counter] = num;
//            counter++;
//        }
//
//        return answer;
//
//    }

    /*
    * without using string
    * */

//    private static int[] plusOne(int[] numbers) {
//
//        int len = numbers.length;
//        long sum = 0;
//        long i = 10;
//
//        while (len != 0) {
//            int number = numbers[len-1];
//
//            if (len == numbers.length){
//                sum = Integer.sum(number, 1);
//            }
//
//            if (len == numbers.length){
//                len--;
//                continue;
//            } else {
//                sum = sum + number*i;
//            }
//
//            i= i*10;
//            len--;
//        }
//
//        int count = 0;
//        long ans = sum;
//
//        while (sum != 0) {
//            count++;
//            sum /= 10;
//        }
//
//        int[] answer = new int[count];
//
//        while (count != 0) {
//            long mod = ans % 10;
//
//            answer[count-1] = (int) mod;
//            ans /= 10;
//
//            count--;
//        }
//
//
//        return answer;
//    }


}
