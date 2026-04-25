package Strings;

public class CheckDigits {

    static boolean checkDigits(String str) {

        if(str.length() == 0) return false;

        //handling negative numbers

        int start = 0;
        if(str.charAt(start) == '-')
        {
            if(str.length() == 0) return false;
            start = 1;
        }

        for(int i = start; i < str.length(); i++) {
           char c = str.charAt(i);
           
           //if(c == ' ') continue; // --> when we have to skip spaces;

           if(c < '0' || c > '9')
             return false;
        }
        return true;      
    }

    public static void main(String[] args) {
        String str = "-11122";
        System.out.println(checkDigits(str));
    }
    
}
