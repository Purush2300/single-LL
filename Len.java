public class Len {
    public static void main(String[] args) {
       String s="(()()()())";
       int depth=0;
       StringBuilder sb= new StringBuilder();
       for (char c : s.toCharArray()) {
        if(c=='('){
            if(depth>0){
                sb.append(c);
                
            }
            depth++;
        }
            else{
                depth--;
                if(depth>0){
                    sb.append(c);
                }
            }
        
       } 
       System.out.println(sb.toString());
    }

   
}
