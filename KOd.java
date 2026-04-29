public class KOd {
    public static void main(String[] args) {
        String s = "good morning";
        String result="";
       String []a=s.split(" ");
       for (String string : a) {
        String rev="";
        
        for (int i = string.length()-1; i >=0; i--) {
            rev+=string.charAt(i);
        }
        result+=rev+" ";
       }
       System.out.println(result.trim());
    }
}