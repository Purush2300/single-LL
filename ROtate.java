public class ROtate {
    public static void main(String[] args) {
        int[][]a={{1,2,3},{4,5,6},{7,8,9}};
        int r=a.length;
        int c=a[0].length;
        int []ans1=new int[r*c];
        int k=0;
       int top=0;
       int bottom=r-1;
       int left=0;
       int right=c-1;
       while (left<=right && top<=bottom) {
        for (int i = left; i <= right; i++) {
            ans1[k++]=a[top][i];
       }
       top++;
       for (int i = top; i <=bottom; i++) {
        ans1[k++]=a[i][right];
       }
       right--;
       if(top<=bottom){
                for (int i = right; i >=left; i--) {
                ans1[k++]=a[bottom][i];
                }
                bottom--;
       }
     if(left<=right){
                for (int i = bottom; i >=top; i--) {
                ans1[k++]=a[i][left];
                }
                left++;
     }
       }
       for (int i = 0; i < ans1.length; i++) {
        System.out.print(ans1[i]+" ");
       }
    }
}
