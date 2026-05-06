package  Problems;

import java.util.Arrays;

public class Problemy {
    public static void main(String[] args) {
        String s="grees";
        System.out.println(palindrom(s));
      
     
     
    }

    private static boolean palindrom(String s) {

            int freq[]= new int[26];
            for (int i = 0; i < s.length(); i++) {
                char c=s.charAt(i);
                freq[c-'a']++;
            }
            int cnt=0;
            for (int i : freq) {
                if(i%2!=0){
                    cnt++;
                }
                if(cnt>1){
                    return false;
                }
            }
        return true;
       
    }
}
