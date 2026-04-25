package Strings;

public class frequencyOfChar {

    static int charFrequency(String str, char target) {
        
        // char c = 'a';
        // int count = 0;
        // char[] ch = str.toCharArray();
        // for(char c1: ch)
        // {
        //     if(c1 == c) {
        //         count++;
        //     }
        // }
        // return count;

        // int count = 0;
        // for(int i=0; i<str.length(); i++) {
        //     if(str.charAt(i) == target) 
        //         count++;
        // }
        // return count;

        //for case sensitive
        int count = 0;
        target = Character.toLowerCase(target);
        for(int i=0; i<str.length(); i++) {
            if(Character.toLowerCase(str.charAt(i)) == target) 
                count++;
        }
        return count;


    }
    public static void main(String[] args) {

        String str = "Aditya Thakur";
        System.out.println(charFrequency(str, 'A'));
        
    }
    
}
