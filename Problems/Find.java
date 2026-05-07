package  Problems;

import java.util.Arrays;

public class Find {
    public static void main(String[] args) {
        String s1="geeks";
        String s2="kseeg";
        char[]a=s1.toCharArray();
        Arrays.sort(a);
        char[]b=s2.toCharArray();
         Arrays.sort(b);

        if(Arrays.equals(a, b)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }


    }
}
