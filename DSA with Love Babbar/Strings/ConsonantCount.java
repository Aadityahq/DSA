package Strings;

class consonantCount {

    static int countConsonant(String str) {
        
        String consonant = "bcdfghjklmnpqrstvwxyz";
        str = str.toLowerCase();

        int count = 0;
        char[] ch = str.toCharArray();

        for(char c : ch) {
            if(consonant.indexOf(c) != -1) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {

        String str = "Aditya Thakur";
        System.out.println(countConsonant(str));
        
    }

}