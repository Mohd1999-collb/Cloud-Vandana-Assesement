package Java;

import java.util.Scanner;

public class Panagram {

    private static boolean isLetter(char ch) {
        // If the character is letter then return true
        if ((int) ch >= 97 && ch <= 122) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isPanagram(String str) {
        boolean[] arr = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            // Check character is letter or not
            if (isLetter(str.charAt(i))) {
                int index = str.charAt(i) - 'a';
                arr[index] = true;
            }
        }

        for (boolean flag : arr) {
            // If any character is not present in the string then return false
            if (flag == false) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // call to panagram function
        if (isPanagram(str.toLowerCase())) {
            System.out.println("String is panagram.");
        } else {
            System.out.println("String is not panagram.");
        }
        sc.close();

        /*
         * Time complexity = O(n){using for loop}
         * Space complexity = O(n){using auxilary array}
         * where n = string length
         */
    }
}
