public class new1 {
    public static void main(String[] args) {
        String a="baab";
        String p="";
        for (int i = 0; i < a.length(); i++) {
         

    if (i == 0 || a.charAt(i) != a.charAt(i - 1)) {
        p += a.charAt(i);
    }

           
        }
        System.out.println(p);
    }
}
