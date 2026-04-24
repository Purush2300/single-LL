public class All {
    public static void main(String[] args) {
        int[]a={1,2,3,4,5};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int j2 = i; j2 <j; j2++) {
                    System.out.println(a[j2]+" ");
                }
                System.out.println();
               
            }
        
        }
    }
}
