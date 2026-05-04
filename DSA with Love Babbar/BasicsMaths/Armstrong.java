package BasicsMaths;

import java.util.Scanner;

public class Armstrong {
    static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        while(num != 0) {
            int digit = num % 10;
            sum = sum + digit * digit * digit;
            num = num / 10;
        }
        return  originalNum == sum ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :  ");
        int num = sc.nextInt();
        sc.close();
        System.out.println(isArmstrong(num));
    }
}
