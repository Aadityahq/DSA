package BasicsMaths;

import java.util.Scanner;

public class PerfectNumber {

    static boolean isPerfect(int num) {

//        int sum = 1;
//        for(int i = 2; i < num; i++) {
//            if(num % i == 0) {
//                sum = sum + i;
//            }
//        }
//        System.out.println(sum);
//        return num == sum;

        int sum = 1;
        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) {
                int firstFactor = i;
                int secondFactor = num / i;
                if(firstFactor == secondFactor)
                    sum = sum + firstFactor;
                else
                    sum = sum + firstFactor + secondFactor;
            }
        }
        System.out.println(sum);
        return sum == num;



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :  ");
        int num = sc.nextInt();
        sc.close();
        System.out.println(isPerfect(num));
    }
}
