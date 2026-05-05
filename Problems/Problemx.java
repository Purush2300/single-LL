package  Problems;
public class Problemx {
    public static void main(String[] args) {
        String s="abEkipo";
        String res="";
        for (int i = 0; i <s.length(); i++) {
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                res+=c;
            }
            
        }
        if(res.length()<0){
            System.out.println("No Vowel Match");
        }
    }
}
