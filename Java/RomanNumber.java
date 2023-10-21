package Java;

import java.util.Scanner;

public class RomanNumber {

    /*
     * SYMBOL------>VALUE
     * I----------->1
     * IV---------->4
     * V ---------->5
     * IX---------->9
     * X ---------->10
     * XL---------->40
     * L ---------->50
     * XC---------->90
     * C ---------->100
     * CD---------->400
     * D ---------->500
     * CM---------->900
     * M ---------->1000
     */

    private static int integerValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }

    private static int romanToInteger(String roman) {
        int sum = 0;
        for (int i = 0; i < roman.length(); i++) {
            int s1 = integerValue(roman.charAt(i));
            if (i + 1 < roman.length()) {
                int s2 = integerValue(roman.charAt(i + 1));
                if (s1 >= s2) {
                    sum = sum + s1;
                } else {
                    sum = sum - s1;
                }

            } else {
                sum = sum + s1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(romanToInteger(str.toUpperCase()));
        sc.close();
    }

    /*
     * Time complexity = O(n){using for loop}
     * Space complexity = O(1){No extra space is required}
     * where n = String length
     */
}
