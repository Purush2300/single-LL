class Listnode {
    int data;
    Listnode next;
    Listnode(int val){
        this.data=val;
        this.next=null;
    }
}





public class First {


    





    public static void main(String[] args) {
        int []a={11,2,3,4,5};
        Listnode head=converttoll(a);
        Listnode temp=head;
      
        // System.out.println(  search(temp,13));
        System.out.println(length(head));
        
     
    }

    private static int length(Listnode head) {
        int cnt=0;
        Listnode temp=head;
        while (temp!=null) {
            cnt++;
            temp=temp.next;
        }
        return cnt;
       
    }

    private static int search(Listnode temp, int i) {
     while (temp!=null) {
        if(temp.data==i){
            return 1;
        }
           
            temp=temp.next;
        }
     return 0;
    }

    private static Listnode converttoll(int[] a) {
            Listnode head= new Listnode(a[0]);
            Listnode marker=head;
            for (int i = 1; i < a.length; i++) {
                Listnode temp=new Listnode(a[i]);
                marker.next=temp;
                marker=temp;
            }

        return head;
      
    }
}