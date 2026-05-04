package BasicsMaths;

import java.util.Scanner;

public class LCM {
    static int lcmOfNumber(int num1, int num2) {
        int a = num1;
        int b = num2;
         while(b!=0) {
             int temp = b;
             b = a%b;
             a = temp;
         }
         int gcd = a;
         int prod = num1 * num2;
         int lcm = prod / gcd;
         return lcm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first  numbers :  ");
        int num1= sc.nextInt();
        System.out.print("Enter second  numbers :  ");
        int num2 = sc.nextInt();
        sc.close();
        System.out.println(lcmOfNumber(num1, num2));
    }
}
