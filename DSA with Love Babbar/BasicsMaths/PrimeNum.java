package BasicsMaths;

import java.util.Scanner;

public class PrimeNum {
    static boolean isPrime(int num) {
        if(num <= 1)
            return false;

        //for(int i = 2; i < num; i++) {
        for(int i = 2; i*i <= num; i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :  ");
        int num = sc.nextInt();
        sc.close();
        System.out.println(isPrime(num));
    }
}
