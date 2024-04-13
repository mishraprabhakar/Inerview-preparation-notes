package ds.previously_solved.warm_up;

import java.util.HashSet;

public class DuplicateInArray {

    public static void main(String[] args) {

        String[] stringArray = {"java", "C", "C++", "python", "C#"};
        HashSet<String> hashSet = new HashSet<>();
        boolean duplicateFound = false;


        for (String s : stringArray){
            if (hashSet.add(s) == false){
                System.out.println("Duplicate Found!!!");
                duplicateFound = true;
            }
        }

        if(!duplicateFound){
            System.out.println("No duplicate found!!!");
        }

    }
}
