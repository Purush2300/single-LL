package  Problems;

public class Find {
    public static void main(String[] args) {
        String s="..greeks.for..greek";
        String[]words=s.split("\\.+",-1);
        StringBuilder sb=new StringBuilder();
       for (int i = words.length-1; i >=0; i--) {
        if(words[i].length()>0){
            if(sb.length()>0){
                sb.append(".");
            }
            sb.append(words[i]);
        }
       }

       System.out.println(sb.toString());
    }
}
