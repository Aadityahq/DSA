package Strings;

public class upperCase {

    static String toUpperCase(String str) {
        
        // String upperCaseString = "";

        // for(int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);

        //     if(ch >= 'a' && ch <= 'z') { // char have to be greater than a and less than b;
        //         ch =(char) (ch - 32); // uppercase and lowecase char differ by 32;
        //     }

        //     upperCaseString = upperCaseString + ch;
        // }
        // return upperCaseString;

        StringBuilder upperCaseString = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z') { // char have to be greater than a and less than b;
                ch =(char) (ch - ('a' - 'A')); // uppercase and lowecase char differ by 32; this one handles contraints like number /symbols unchanged;
            }

            upperCaseString.append(ch);
        }
        return upperCaseString.toString();
    }
    public static void main(String[] args) {
     
        String str = "Aaditya123";
        System.out.println(toUpperCase(str));
    }
    
}
