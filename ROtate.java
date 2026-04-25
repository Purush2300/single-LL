public class ROtate {
    public static void main(String[] args) {
        int[][]a={{1,1,1},{1,0,1},{1,1,1}};
        int r=a.length;
        int col=a[0].length;
        boolean[]r1=new boolean[r];
        boolean[]c1=new boolean[col];
        for (int i = 0; i < c1.length; i++) {
           for (int j = 0; j < c1.length; j++) {
            if(a[i][j]==0){
                r1[i]=true;
                c1[j]=true;

            }
           }
        }
        for (int i = 0; i < c1.length; i++) {
            for (int j = 0; j < c1.length; j++) {
                if(r1[i]||c1[j]==true){
                    a[i][j]=0;
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
       
    }
}
