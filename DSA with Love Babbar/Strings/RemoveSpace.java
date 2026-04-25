package Strings;

public class RemoveSpace {

    static String removeSpace(String str) {
       
        //String result = "";
        //String[] st = str.split(" ");
        // for(String s: st) {
        //     result += s;
        // }
        // return result;

        // char[] ch = str.toCharArray();
        // for(char c: ch) {
        //     if(c != ' ')
        //         result += c;
        // }
        // return result;
         
        return str.replaceAll("\\s", ""); //using built in function --> remove all whitespaces
    }

    public static void main(String[] args) {
        String str = "Aditya Thakur Swarnkar";
        System.out.println(removeSpace(str));
    }
    
}
