public class ROtate {
    public static void main(String[] args) {
        int[]a={1, 2, 2, 4, 3, 1, 4};
        for (int i = 0; i < a.length; i++) {
            int cout=0;
            for (int j = 0; j < a.length; j++) {
                if(a[i]==a[j]){
                   cout++;
                }
            }
            if(cout==1){
                System.out.println(a[i]);
            }
        }


    }
}
