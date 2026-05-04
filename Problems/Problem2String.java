package  Problems;

public class Problem2String {
    public static void main(String[] args) {
        String name="ceghij";
        String novol="";
        name.toLowerCase();
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)=='a'|| name.charAt(i)=='e'||name.charAt(i)=='i'
            ||name.charAt(i)=='o'||name.charAt(i)=='u' )
            {

            }
           
               else{ 
                novol+=name.charAt(i);
            }
            
        }
        System.out.println(novol);
    }
}
