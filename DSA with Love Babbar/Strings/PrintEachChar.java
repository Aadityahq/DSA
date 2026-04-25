package Strings;

 
public class PrintEachChar {

    static void printEachCharacter(String str) {
        int n = str.length();
        char[] ch = str.toCharArray();

        for(char c: ch) {
            System.out.println("Value of char: " + c);
        }
		
	}

    static int lengthOfCharacter(String str) {
        char[] ch = str.toCharArray();

        // int count = 0;
        // for(char c: ch) {
        //     count++;
        // }

        int count = ch.length;
        return count;
		
	}

    static int vowelsCount(String str) {

        int n = str.length();
        int count = 0;
        String vowels = "aeiouAEIOU";
        
        // for(int i=0; i<n; i++) {
        //     char ch = str.charAt(i);
        //     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
        //        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        //         count++;
        //     }

        // }

        // str = str.toLowerCase();
        // for(int i=0; i<n; i++) {
        //     char ch = str.charAt(i);
        //     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        //         count++;
        //     }

        // }

        char[] ch = str.toCharArray();
        // for(char c : ch) {
        //     if(vowels.contains(String.valueOf(c))) {
        //         count++;
        //     }
        // }

         for(char c : ch) {
            if(vowels.indexOf(c) != -1) {
                count++;
            }
        }
        
        return count;
    }


    static String reverseString(String str) {

        // char[] ch = str.toCharArray();
        // int start = 0;
        // int end = ch.length -1;

        // while(start < end) {
        //     char temp = ch[start];
        //     ch[start] = ch[end];
        //     ch[end] = temp;
        //     start++;
        //     end--;
        // }

        // //String s =  ch.toString(); --> this does not work in java because array does not override toString() in java else it calls default Object.toString() --> gives reference not content; 
        // // so intead we can do this 
        // String s = new String(ch);
        // System.out.println(s);

        // //using loop
        // // for(char c: ch) {
        // //     System.out.print(c);
        // // }
        // // System.out.println();


        //This approach is good for beginner
        int n = str.length();
        String reverse = "";

        for(int i = n-1; i>=0; i--) {
            char ch = str.charAt(i);
            reverse = reverse + ch;

        }
        return reverse;

    //     int n = str.length();
    //     char[] ch = new char[n];

    //     int j = 0;
    //     for(int i = n-1; i>=0; i--) {
    //         char c = str.charAt(i);

    //         ch[j++] = c;
    //     }

    //     String ss = new String(ch);
    //     System.out.println(ss);

    // }
}

    static boolean isPalindrome(String str) {

        int n = str.length();
        String reverse = "";

        for(int i = n-1; i>=0; i--) {
            char ch = str.charAt(i);
            reverse = reverse + ch;

        }
        //return reverse.equals(str);

        for(int i = 0; i < n; i++) {
            char c1 = str.charAt(i);
            char c2 = reverse.charAt(i);

            if(c1 != c2)
                return false;
        }
        return true;
    }


    public static void main(String[] args) {

        String st = "Aditya";
        printEachCharacter(st);
        System.out.println(lengthOfCharacter(st));
        System.out.println(vowelsCount(st));
        System.out.println(reverseString(st));
        System.out.println(isPalindrome(st));
          
    }


}

		




