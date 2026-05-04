package BasicsMaths;

import java.util.Scanner;

public class PowerOfNumber {
    static int pow(int num1, int num2) {
        int result = 1;
        for(int i = 1; i <= num2; i++) {
            result = result * num1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter a power : ");
        int num2 = sc.nextInt();
        System.out.println(pow(num1,num2));
    }
}
