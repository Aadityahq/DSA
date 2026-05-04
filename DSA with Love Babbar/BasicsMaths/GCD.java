package BasicsMaths;

import java.util.Scanner;

public class GCD {

    static int gcdOfNumber(int a, int b) {
        //gcd(a,b) = gcd(b, a%b);
        //a = b
        //b = a%b

        while(b!=0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first  numbers :  ");
        int num1= sc.nextInt();
        System.out.print("Enter second  numbers :  ");
        int num2 = sc.nextInt();
        sc.close();
        System.out.println(gcdOfNumber(num1, num2));
    }
}
