public class Problemstring {
    public static void main(String[] args) {
        String []arr={"Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeek"};
            int max=0;
            String s="";
        for (String string : arr) {
        int curlen=string.length();
        if (curlen>max) {
            s="";
            max=curlen;
            s=string;
        }
        if(curlen==max){
            s=s;
        }
        }
        System.out.println(s);
    }
}
