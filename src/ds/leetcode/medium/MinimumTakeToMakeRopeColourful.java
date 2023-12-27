package ds.leetcode.medium;

public class MinimumTakeToMakeRopeColourful {

    public static void main(String[] args) {

        int[] array = {3,5,10,7,5,3,5,5,4,8,1};
        int result = minCost("aaabbbabbbb", array);
        System.out.println(result);
    }

    private static int minCost(String colors, int[] neededTime) {

        int compindex=0;
        int res = 0;

        for(int i=1;i<neededTime.length;i++){
            if(colors.charAt(i) != colors.charAt(i-1)){
                compindex = i;
            }
            else{
                if(neededTime[i] < neededTime[compindex]){
                    res+=neededTime[i];
                }
                else{
                    res+=neededTime[compindex];
                    compindex =  i;
                }
            }
        }
        return res;
    }
}
