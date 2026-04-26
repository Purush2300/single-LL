public class ROtate {
    public static void main(String[] args) {
        int[]a={10, 5, 2, 7, 1, 9};
       int longest=0;
       int k=15;
       for (int i = 0; i < a.length; i++) {
        int sum=0;
        for (int j = i; j < a.length; j++) {
            sum+=a[j];
            if(sum==k){
                longest=Math.max(longest, j-i+1);
            }
        }
       }
       System.out.println(longest);
    }
}
