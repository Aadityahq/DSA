package Array;

import java.util.Scanner;

public class jaggedArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int arr[][] = new int[rows][];

        for(int i = 0; i < rows; i++) {
            System.out.print("Enter number of comlumns for row " + i + ": " );
            int cols = sc.nextInt();

            arr[i] = new int[cols]; // this is how to take columns input for each row 

            System.out.print("Enter the element for row: " + i + ": ");

            for(int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }   
        }

        sc.close();

        System.out.println();
        System.out.println("Jagged Array: ");

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //Sum of element of array
        // int sum = 0;
        // System.out.println("Sum of element of jagged array is: ");
        //  for(int i = 0; i < rows; i++) {
        //     for(int j = 0; j < arr[i].length; j++) {
        //         sum = sum + arr[i][j];
        //     }
        // }
        // System.out.println(sum);

        //Product of element of array
        // int product = 1;
        // System.out.println("Sum of element of jagged array is: ");
        //  for(int i = 0; i < rows; i++) {
        //     for(int j = 0; j < arr[i].length; j++) {
        //         product = product * arr[i][j];
        //     }
        // }
        // System.out.println(product);

        //Maximum element of array
        // int maxElement = arr[0][0];
        // System.out.println("Maximum element of jagged array is: ");
        //  for(int i = 0; i < rows; i++) {
        //     for(int j = 0; j < arr[i].length; j++) {
        //         if(arr[i][j] > maxElement) {
        //             maxElement = arr[i][j];
        //         }
        //     }
        // }
        // System.out.println(maxElement);

        int minElement = arr[0][0];
        System.out.println("Minimum element of jagged array is: ");
         for(int i = 0; i < rows; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] < minElement) {
                    minElement = arr[i][j];
                }
            }
        }
        System.out.println(minElement);

    }
}
