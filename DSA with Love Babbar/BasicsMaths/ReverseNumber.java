package BasicsMaths;

import java.util.Scanner;

public class ReverseNumber {

    static int reverseNumber(int num) {
         int reverse = 0;

         while(num != 0) {
             int digit = num % 10;
             reverse = reverse * 10 + digit;
             num = num / 10;
         }

         return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to reverse and it does not have to start form:  ");
        int num = sc.nextInt();
        sc.close();

        System.out.println(reverseNumber(num));

    }
}
