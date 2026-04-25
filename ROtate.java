public class ROtate {
    public static void main(String[] args) {
        int[]a={7, 0, 0, 1, 7, 7, 2, 7, 7};
        for (int i = 0; i < a.length; i++) {
            int count=0;
            for (int j = i; j < a.length; j++) {
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count>a.length/2){
                System.out.println(a[i]);
                return;
            }
        }
        
        

        System.out.println(-1);
      
        
    }
}
