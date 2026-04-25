public class ROtate {
    public static void main(String[] args) {
        int[]a={1,0,2,1,2,0,0,2,2};
        int low=0;
        int mid=0;
        int high=a.length-1;
        while (mid<=high) {
            if(a[mid]==0){
                int temp=a[mid];
                a[mid]=a[low];
                a[low]=temp;
                low++;
                mid++;
            }
            else if(a[mid]==1){
                mid++;
            }
           else  if(a[mid]==2){
                int temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
      
        
    }
}
