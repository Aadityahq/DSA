package Strings;

public class CountWords {
    
    static int countWords(String str) {

        // int count = 0;
        // String[] words = str.trim().split(" ");
        // for(String st: words) {
        //     count++;
        // }
        // return count;

        // String[] words = str.trim().split("\\s+");
        // return words.length;

        int count = 0;
        boolean inWord = false;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == ' ') {
                inWord = false;
            }
            else if(inWord == false)
            {
                count++;
                inWord = true;
            }
        }

        return count;



        
    }

    public static void main(String[] args) {
        String str = "This is the end! Aditya Thakur";
        System.out.println(countWords(str));
    }
}
