package org.example;

public class Main {
    // 3.
    public static char[] splitNewArr(char[] a, int start, int len)
    {
        if (start < 0 || len < 0 || start >= a.length || (start + len) > a.length) {
            return null;
        }

        char[] chars = new char[len];

        for (int i = 0; i < len; i++) {
            chars[i] = a[start + i];
        }

        return chars;
    }

    // 2.
    public static int f(int[] num)
    {
        if (num.length == 0) return 0;

        int sumOdd = 0, sumEven = 0;
        for (int value: num) {
            if (value % 2 == 0) {
                sumEven += value;
            } else {
                sumOdd += value;
            }
        }

        return sumOdd - sumEven;
    }

    // 1.
    public static int findSecondLargestNum(int[] num)
    {
        if (num.length < 2) return -1;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int value: num) {
            if (value > largest) {
                secondLargest = largest;
                largest = value;
            } else if (value > secondLargest && value != largest) {
                secondLargest = value;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        // 3.
        System.out.println(java.util.Arrays.toString(splitNewArr(new char[]{'a', 'b', 'c'}, 0, 4))); // null
        System.out.println(java.util.Arrays.toString(splitNewArr(new char[]{'a', 'b', 'c'}, 0, 3))); // [a, b, c]
        System.out.println(java.util.Arrays.toString(splitNewArr(new char[]{'a', 'b', 'c'}, 0, 2))); // [a, b]
        System.out.println(java.util.Arrays.toString(splitNewArr(new char[]{'a', 'b', 'c'}, 0, 1))); // [a]
        System.out.println(java.util.Arrays.toString(splitNewArr(new char[]{'a', 'b', 'c'}, 1, 3))); // null
        System.out.println(java.util.Arrays.toString(splitNewArr(new char[]{'a', 'b', 'c'}, 1, 2))); // [b, c]
        System.out.println(java.util.Arrays.toString(splitNewArr(new char[]{'a', 'b', 'c'}, 1, 1))); // [b]
        System.out.println(java.util.Arrays.toString(splitNewArr(new char[]{'a', 'b', 'c'}, 2, 2))); // null
        System.out.println(java.util.Arrays.toString(splitNewArr(new char[]{'a', 'b', 'c'}, 2, 1))); // [c]
        System.out.println(java.util.Arrays.toString(splitNewArr(new char[]{'a', 'b', 'c'}, 3, 1))); // null
        System.out.println(java.util.Arrays.toString(splitNewArr(new char[]{'a', 'b', 'c'}, 1, 0))); // []
        System.out.println(java.util.Arrays.toString(splitNewArr(new char[]{'a', 'b', 'c'}, -1, 2))); // null
        System.out.println(java.util.Arrays.toString(splitNewArr(new char[]{'a', 'b', 'c'}, -1, -2))); // null
        System.out.println(java.util.Arrays.toString(splitNewArr(new char[]{}, 0, 1))); // null

//        // 2.
//        System.out.println(f(new int[]{1}));           // 1
//        System.out.println(f(new int[]{1, 2}));        // -1
//        System.out.println(f(new int[]{1, 2, 3}));     // 2
//        System.out.println(f(new int[]{1, 2, 3, 4}));  // -2
//        System.out.println(f(new int[]{3, 3, 4, 4}));  // -2
//        System.out.println(f(new int[]{3, 2, 3, 4}));  // 0
//        System.out.println(f(new int[]{4, 1, 2, 3}));  // -2
//        System.out.println(f(new int[]{1, 1}));        // 2
//        System.out.println(f(new int[]{}));            // 0

        // 1.
        /*System.out.println(findSecondLargestNum(new int[]{1, 2, 3, 4})); // 3
        System.out.println(findSecondLargestNum(new int[]{4, 1, 2, 3})); // 3
        System.out.println(findSecondLargestNum(new int[]{1, 1, 2, 2})); // 1
        System.out.println(findSecondLargestNum(new int[]{1, 1}));       // -1
        System.out.println(findSecondLargestNum(new int[]{1}));          // -1
        System.out.println(findSecondLargestNum(new int[]{}));           // -1*/
    }
}