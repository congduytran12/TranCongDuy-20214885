// ArraySort.java - 6.5

import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Please enter the input array: ");
        int[] a = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Sorted array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int sumOfArray = 0;
        for (int i = 0; i < n; i++) {
            sumOfArray += a[i];
        }
        System.out.println("Sum of array elements: " + sumOfArray);
        System.out.println("Average value of array elements: " + (sumOfArray / n));
    }
}
