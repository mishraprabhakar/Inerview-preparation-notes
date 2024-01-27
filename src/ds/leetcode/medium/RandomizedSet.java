package ds.leetcode.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class RandomizedSet {

    Set<Integer> s;

    public RandomizedSet() {
        s = new HashSet<>();
    }

    public boolean insert(int val) {
        if(s.contains(val)) {
            return false;
        } else{
            s.add(val);
            return true;
        }
    }

    public boolean remove(int val) {

        if(s.contains(val)) {
            s.remove(val);
            return true;
        } else {
            return false;
        }
    }

    public int getRandom() {

        List<Integer> list = new ArrayList<Integer>(s);
        int r = (int) (Math.random()*s.size());

        return list.get(r);
    }

    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        boolean param_1 = obj.insert(2);
        boolean param_2 = obj.insert(3);
        boolean param_3 = obj.insert(4);
        boolean param_4 = obj.remove(2);
        int param_5 = obj.getRandom();
        System.out.println(param_1+" "+param_2+" "+param_3+" "+param_4+" "+param_5);
    }
}
