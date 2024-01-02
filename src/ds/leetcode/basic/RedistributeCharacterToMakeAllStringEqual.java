package ds.leetcode.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RedistributeCharacterToMakeAllStringEqual {

    public static void main(String[] args) {

        String[] words = {"ab","a"};

//        boolean result = makeEqual(words);
        boolean b = makeEqualChar(words);
        System.out.println(b);
    }

    private static boolean makeEqual(String[] words) {

        Map<Character, Integer> map = new HashMap<>();
        String temp = "";
        Integer firstValue = null;

        if (words.length == 1) {
            return true;
        }


        for (String s : words) {
            temp += s;
        }

        for (Character ch : temp.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }

        for (Integer value : map.values()) {
            if (firstValue == null) {
                firstValue = value;
            } else if (firstValue > words.length && firstValue % words.length != 0) {
                return false;
            }
        }

        return true;

    }

    public static boolean makeEqualChar(String[] words) {
        int[] fre = new int[26];
        for(int i=0;i<words.length;i++){
            String w = words[i];

            for(int j=0;j<w.length();j++){
                char ch = w.charAt(j);
                int idx = (int)(ch-'a');
                fre[idx]=fre[idx]+1;
            }
        }

        for(int i=0;i<26;i++){
            if(fre[i] % words.length!=0){
                return false;
            }
        }
        return true ;
    }
}
