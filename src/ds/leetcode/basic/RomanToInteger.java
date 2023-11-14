package ds.leetcode.basic;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {

        String s = "VII";

        int a = findRomanToInteger(s);
        System.out.println(a);
    }

    private static int findRomanToInteger(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = 0;

        for(int i =0; i<s.length()-1; i++){
            if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1))){
                result = result + map.get(s.charAt(i));
            }else{
                result = result - map.get(s.charAt(i));
            }
        }
        result = result + map.get(s.charAt(s.length()-1));
        return result;
    }

    /*private static int findRomanToInteger(String s) {

        Map<Character, Integer> romanValues = new HashMap<>();

        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int sum = romanValues.get(s.charAt(s.length()-1));

        for (int i = s.length()-2; i >= 0; i=i-1) {

            char key = s.charAt(i);
            int j = i+1;
            char key1 = s.charAt(j);

            if (romanValues.containsKey(key) && romanValues.containsKey(key1)) {

                Integer i1 = romanValues.get(key);
                Integer i2 = romanValues.get(key1);
                if (i1 < i2) {
                    sum = sum - i1;
                } else {
                    sum = sum + i1;
                }

            } else {
                return 0;
            }
        }

        return sum;
    }*/
}
