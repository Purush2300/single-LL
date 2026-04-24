public class Merge {
    public static void main(String[] args) {
        int []a1 = {4,5,6};
        int []a2 = {1,2,3,4};
        int i=0;
        int j=0;
        int []result = new int[a1.length+a2.length];
        int k=0;
        while(i<a1.length && j<a2.length){
            if(a1[i]<a2[j]){
                result[k]=a1[i];
                k++;
                i++;
            }
            else{
                result[k]=a2[j];
                k++;
                j++;
            }
        }
        while (i<a1.length) {
            result[k]=a1[i];
            i++;
            k++;
        }
            while (j<a2.length) {
            result[k]=a1[j];
            j++;
            k++;
        }


        for (int k2 = 0; k2 < result.length; k2++) {
            System.out.print(result[k2]+" ");
        }



    }
}
