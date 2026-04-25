package Array;

import java.util.Scanner;

public class sumOfElement {
    public static void main(String[] args) {
        
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element for inder " + i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Array contains: ");
        for(int val : arr) {
            System.out.println(val);
        }
        sc.close();

        System.out.println("Sum of elements of an array is: ");
        int sum = 0;
        for(int val : arr) {
            sum += val;
        }
        System.out.println(sum);

    }
    
}