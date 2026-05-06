package  Problems;

import java.util.Arrays;

public class Problemy {
    public static void main(String[] args) {
        String s="greeks";
        char[]c=s.toCharArray();
        Arrays.sort(c);
     int left=0;
     int right=c.length-1;
     while (left<=right) {
        char temp=c[left];
        c[left]=c[right];
        c[right]=temp;
        left++;
        right--;
     }
     
     System.out.println(new String(c));
    }
}
