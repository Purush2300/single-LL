package  Problems;

public class Problem2String {
    public static void main(String[] args) {
        String name="ceghij";
        String novol="";
        for (int i = 0; i < name.length(); i++) {
            char c=name.charAt(i);
            if(isvowel(c,name)==true){
                
            }
        }
       
        
        System.out.println(novol);
    }

    private static boolean isvowel(char c,String name) {


            for (int i = 0; i < name.length(); i++) {
            if(c=='a'|| c=='e'||c=='i'
            ||c=='o'||c=='u' || (c>=0 && c<=9))
            {
                return true;
            }
           
           
            
        }



        return false;
    }

}
