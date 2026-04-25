package BasicsMaths;

import java.util.Scanner;

public class CountEvenDigits {
        static int countEvenDigits(int num) {

            int count = 0;
            while(num!=0) {
                int digit = num % 10;
                if(digit % 2 == 0)
                {
                    count++;
                }
                num = num / 10;
            }
            return count;
        }
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number which does not start from 0:  ");
            int num = sc.nextInt();
            sc.close();

            System.out.println(countEvenDigits(num));
//        int num1 = 878;
//        System.out.printf("%06d", num);  // prints 000878

        }
    }
