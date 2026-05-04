package BasicsMaths;
import java.util.Scanner;
import static BasicsMaths.ReverseNumber.reverseNumber;

public class PalindromeNum {
    static boolean isPalindrome(int num) {

        //int number = Math.abs(num); --> if we want to check regardless of the negative number then we use this
        if (num < 0) return false;
//        int number = num;
//        int revNum = 0;
//        while(num!=0) {
//            int digit = num % 10;
//            revNum = revNum * 10 + digit;
//            num = num / 10;
//        }
//
        int revNum = reverseNumber(num);
        //if(revNum == number)
        if(num == revNum){
            System.out.println("Number is Palindrome");
            return true;
        }
        else {
            System.out.println("Not a palindrome number");
            return false;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number which should not start from 0:  ");
        int num = sc.nextInt();
        sc.close();
        System.out.println(isPalindrome(num));

    }
}
