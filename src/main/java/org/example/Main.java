package org.example;

public class Main {
    // 6
    public static int findThePointOfEquilibrium(int[] a)
    {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of elements in the array
        for (int num : a) {
            totalSum += num;
        }

        // Iterate through each index of the array
        for (int i = 0; i < a.length; i++) {
            // Subtract the current element from the total sum to get the sum of elements after the index
            totalSum -= a[i];

            // If the sum of elements before the index equals the sum of elements after the index, return the index
            if (leftSum == totalSum) {
                return i;
            }

            // Add the current element to the left sum
            leftSum += a[i];
        }

        // If no POE is found, return -1
        return -1;
    }

    // 5.
    public static int[] findCommonValues(int[] first, int[] second)
    {
        if (first == null || second == null) {
            return null;
        }

        int len = Math.min(first.length, second.length);
        int[] result = new int[len];
        int index = 0;

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (first[i] == second[j]) {
                    result[index] = first[i];
                    index++;
                    break;
                }
            }
        }

        return trimArray(result, index);
    }

    // Function to print array elements
    public static void printArray(int[] arr) {
        if (arr == null) {
            System.out.println("null");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Function to trim the array to remove unused slots
    public static int[] trimArray(int[] arr, int size) {
        int[] trimmedArray = new int[size];
        System.arraycopy(arr, 0, trimmedArray, 0, size);
        return trimmedArray;
    }

    public static int reverseNum(int num)
    {
        if (num > -10 && num < 10) return num;

        int reversedNum = 0;

        while (num != 0) {
            reversedNum = reversedNum * 10 + (num % 10);
            num = num / 10;
        }

        return reversedNum;
    }

    // 4.
    public static int isCenteredArray(int[] nums)
    {
        if (nums.length % 2 == 0) {
            return 0;
        }

        int indexMiddle = nums.length / 2;
        int elementMiddle = nums[indexMiddle];

        for (int i = 0; i < nums.length; i++) {
            if (i != indexMiddle && nums[i] <= elementMiddle) {
                return 0;
            }
        }

        return 1;
    }

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
        // 7.
        System.out.println(findThePointOfEquilibrium(new int[]{1, 8, 3, 7, 10, 2}));    // Output: 3
        System.out.println(findThePointOfEquilibrium(new int[]{1, 5, 3, 1, 1, 1, 1, 1, 1})); // Output: 2
        System.out.println(findThePointOfEquilibrium(new int[]{2, 1, 1, 1, 2, 1, 7})); // Output: 5
        System.out.println(findThePointOfEquilibrium(new int[]{1, 2, 3}));             // Output: -1
        System.out.println(findThePointOfEquilibrium(new int[]{3, 4, 5, 10}));         // Output: -1
        System.out.println(findThePointOfEquilibrium(new int[]{1, 2, 10, 3, 4}));      // Output: -1

        // 6.
        /*int[] first1 = {1, 8, 3, 2};
        int[] second1 = {4, 2, 6, 1};
        printArray(findCommonValues(first1, second1)); // Output: [1, 2]

        int[] first2 = {1, 8, 3, 2, 6};
        int[] second2 = {2, 6, 1};
        printArray(findCommonValues(first2, second2)); // Output: [1, 2, 6]

        int[] first3 = {1, 3, 7, 9};
        int[] second3 = {7, 1, 9, 3};
        printArray(findCommonValues(first3, second3)); // Output: [1, 3, 7, 9]

        int[] first4 = {1, 2};
        int[] second4 = {3, 4};
        printArray(findCommonValues(first4, second4)); // Output: []

        int[] first5 = {};
        int[] second5 = {1, 2, 3};
        printArray(findCommonValues(first5, second5)); // Output: []

        int[] first6 = {1, 2};
        int[] second6 = {};
        printArray(findCommonValues(first6, second6)); // Output: []

        int[] first7 = {1, 2};
        int[] second7 = null;
        printArray(findCommonValues(first7, second7)); // Output: null

        int[] first8 = null;
        int[] second8 = {};
        printArray(findCommonValues(first8, second8)); // Output: null

        int[] first9 = null;
        int[] second9 = null;
        printArray(findCommonValues(first9, second9)); // Output: null*/

        // 5. 
        /*System.out.println(reverseNum(1234));   // 4321
        System.out.println(reverseNum(12005));  // 50021
        System.out.println(reverseNum(1));      // 1
        System.out.println(reverseNum(1000));   // 1
        System.out.println(reverseNum(0));      // 0
        System.out.println(reverseNum(-12345)); // -54321*/
        
        // 4.
        /*System.out.println(isCenteredArray(new int[]{1, 2, 3, 4, 5})); // 0
        System.out.println(isCenteredArray(new int[]{3, 2, 1, 4, 5})); // 1
        System.out.println(isCenteredArray(new int[]{3, 2, 1, 4, 1})); // 0
        System.out.println(isCenteredArray(new int[]{1, 2, 3, 4}));    // 0
        System.out.println(isCenteredArray(new int[]{}));              // 0
        System.out.println(isCenteredArray(new int[]{10}));            // 1*/

        // 3.
        /*System.out.println(java.util.Arrays.toString(splitNewArr(new char[]{'a', 'b', 'c'}, 0, 4))); // null
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
        System.out.println(java.util.Arrays.toString(splitNewArr(new char[]{}, 0, 1))); // null*/

        // 2.
        /*System.out.println(reverseNum(new int[]{1}));           // 1
        System.out.println(reverseNum(new int[]{1, 2}));        // -1
        System.out.println(reverseNum(new int[]{1, 2, 3}));     // 2
        System.out.println(reverseNum(new int[]{1, 2, 3, 4}));  // -2
        System.out.println(reverseNum(new int[]{3, 3, 4, 4}));  // -2
        System.out.println(reverseNum(new int[]{3, 2, 3, 4}));  // 0
        System.out.println(reverseNum(new int[]{4, 1, 2, 3}));  // -2
        System.out.println(reverseNum(new int[]{1, 1}));        // 2
        System.out.println(reverseNum(new int[]{}));            // 0*/

        // 1.
        /*System.out.println(findSecondLargestNum(new int[]{1, 2, 3, 4})); // 3
        System.out.println(findSecondLargestNum(new int[]{4, 1, 2, 3})); // 3
        System.out.println(findSecondLargestNum(new int[]{1, 1, 2, 2})); // 1
        System.out.println(findSecondLargestNum(new int[]{1, 1}));       // -1
        System.out.println(findSecondLargestNum(new int[]{1}));          // -1
        System.out.println(findSecondLargestNum(new int[]{}));           // -1*/
    }
}