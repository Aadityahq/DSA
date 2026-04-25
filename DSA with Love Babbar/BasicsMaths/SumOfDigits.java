package BasicsMaths;

import java.util.Scanner;

public class SumOfDigits {
    static int sumOfDigits(int num) {
        int sum = 0;

        while(num!=0) {
            int digits = num % 10;
            sum += digits;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which does not start from 0:  ");
        int num = sc.nextInt();
        sc.close();
        System.out.println(sumOfDigits(num));
    }
}
