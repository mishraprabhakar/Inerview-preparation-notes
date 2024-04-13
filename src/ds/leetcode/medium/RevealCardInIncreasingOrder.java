package ds.leetcode.medium;

import java.util.*;

public class RevealCardInIncreasingOrder {

    public static void main(String[] args) {

        int[] nums = {17,13,11,2,3,5,7};
        int[] arr = deckRevealedIncreasing(nums);
    }

    private static int[] deckRevealedIncreasing(int[] deck) {

        int[] result = new int[deck.length];

        int[] indexes = new int[deck.length];

        for (int i = 0; i < indexes.length; i++) {
            indexes[i] = i;
        }

        int[] sortedDeck = deck;
        Arrays.sort(sortedDeck);

        Queue<Integer> queue = new LinkedList<>();



        int i =0, j = 0;

        for (int k = 0; k < deck.length; k++) {
            if(i <= indexes.length -1 ){
                result[indexes[i]] = sortedDeck[j];
                i++;

                if (i < indexes.length -1) {
                    queue.offer(indexes[i]);
                    i++;
                    j++;
                }

            }

        }

        while(!queue.isEmpty() && j < deck.length) {
            Integer poll = queue.poll();
            System.out.println(poll);
            result[poll] = sortedDeck[j];
            queue.offer(queue.poll());
        }

        return new int[3];
    }
}
