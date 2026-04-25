package Array;

import java.util.Scanner;

public class productOfElement {

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

        System.out.println("Product of elements of an array is: ");
        
        int product = 1;
        for(int val : arr) {
            product *= val;
        }
        System.out.println(product);

    }
    
}
