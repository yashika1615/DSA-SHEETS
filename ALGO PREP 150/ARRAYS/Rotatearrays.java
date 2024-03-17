package ARRAYS; // Package declaration

import java.util.Scanner; // Importing Scanner class to take user input

public class Rotatearrays { // Class declaration

    // Method to reverse a portion of the array
    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // Method to rotate the array to the right by k steps
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Ensuring k is within the range of array length

        reverse(nums, 0, n - k - 1); // Reverse the first portion of the array
        reverse(nums, n - k, n - 1); // Reverse the second portion of the array
        reverse(nums, 0, n - 1); // Reverse the entire array
    }

    public static void main(String[] args) { // Main method
        Scanner scanner = new Scanner(System.in); // Creating Scanner object for user input

        // Prompting the user to enter the size of the array
       
        int size = scanner.nextInt();

        int[] nums = new int[size]; // Creating an array of the specified size

        // Prompting the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        // Prompting the user to enter the number of steps for rotation
        System.out.print("Enter the number of steps for rotation: ");
        int k = scanner.nextInt();

        rotate(nums, k); // Rotating the array by k steps

        // Printing the rotated array
        System.out.println("Rotated Array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        
        scanner.close(); // Closing the scanner to release resources
    }
}
