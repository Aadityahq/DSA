package Array;

import java.util.Scanner;

public class maxElement {
    
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

        
        int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;
        for(int val : arr) {
            if( maxElement <  val) {
                maxElement = val;
            }
            if(minElement > val)
            {
                minElement = val;
            }
            
        }
        System.out.println("Maximim element of array is: " + maxElement);
        System.out.println("Minimum element of array is: " + minElement);


    }
    
}
