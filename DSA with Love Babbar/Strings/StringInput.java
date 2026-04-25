package Strings;

import java.util.Scanner;

class StringInput {

     public static void main(String[] args) {

        //
        Scanner sc = new Scanner(System.in);

        System.out.println(("provide the String Content "));
        String str1 = sc.nextLine();
        System.out.println("value of nextLine " + str1);


        System.out.println(("provide the String Content "));
        String str2 = sc.next();
        System.out.println("Value of next " + str2);

        sc.close();

     }
}