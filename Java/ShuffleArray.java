package Java;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int[] shuffledArray = new int[arr.length];
        System.out.println("Initial array is : " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            // Return the random number between 0 to arr.length-1;
            int index = new Random().nextInt(arr.length);
            shuffledArray[i] = arr[index];
        }
        System.out.println("Shuffled array is : " + Arrays.toString(shuffledArray));

        /*
         * Time complexity = O(n){using for loop}
         * Space complexity = O(n){using auxilary array}
         * where n = array length
         */
    }
}
