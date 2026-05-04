package BasicsMaths;

import java.util.Scanner;

public class AllPrime {

//    static void printAllPrime(int num) {
//
//        for(int i = 2; i <= num; i++) {
//
//            boolean isPrime = true;
//
//            for(int j = 2; j * j <= i; j++) {
//
//                if(i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//
//            if(isPrime) {
//                System.out.println(i);
//            }
//        }
//    }

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

    static void printAllPrime(int n) {
        for(int i = 2; i <= n; i++) {
            boolean isPrime = isPrime(i);
            if(isPrime)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        sc.close();

        printAllPrime(n);
    }
}