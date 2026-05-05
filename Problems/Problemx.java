package  Problems;

import java.util.Arrays;

public class Problemx {
    public static void main(String[] args) {
        String s="jpmztf";
       int cnt=0;
        for (int i = 0; i <s.length(); i++) {
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){

            }
            else{
                cnt++;
            }
        }
        if(cnt%2==0){
            System.out.println("SHE");
        }
        else{
            System.out.println("HE");
        }
       
    }
}
