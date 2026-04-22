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
        int []a={1,2,3,4,5};
        Listnode head=new Listnode(a[3]);
        System.out.println(head.data);
     
    }
}