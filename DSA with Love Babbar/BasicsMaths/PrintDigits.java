package BasicsMaths;

import java.util.Scanner;

public class PrintDigits {

    static void printDigits(int num) {

       while(num!=0) {
           int digit = num % 10;
           System.out.println(digit);
           num = num / 10;
       }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which does not start from 0:  ");
        int num = sc.nextInt();
        sc.close();

        printDigits(num);
//        int num1 = 878;
//        System.out.printf("%06d", num);  // prints 000878

    }
}
