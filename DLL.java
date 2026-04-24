class Node1{
    int data;
    Node1 next;
    Node1 back;
    Node1(int data1,Node1 next,Node1 back){
        this.data=data1;
        this.next=next;
        this.back=back;
    }
    Node1(int data){
        this.data=data;
        this.next=null;
        this.back=null;
    }
}


public class DLL {
    public static void main(String[] args) {
        int []a1={12,13,190,89,15,16};
        Node1 head=converto2ddl(a1);
        // head= firstdel(head);
        head =dellast(head);
         print(head);
    }

    private static Node1 dellast(Node1 head) {
       if(head==null||head.next==null){
            return  null;
        }
        Node1 tail=head;
        while (tail.next!=null) {
            tail=tail.next;
        }
        Node1 prev=tail.back;
        prev.next=null;
        tail.back=null;



        return head;
    }

    private static Node1 firstdel(Node1 head) {

        if(head==null||head.next==null){
            return  null;
        }
        Node1 prev=head;

        head=head.next;
        head.back=null;
        prev.next=null;



        return head;
    }

    private static void print(Node1 temp) {
   while (temp!=null) {
    System.out.print(temp.data+" ");
    temp=temp.next;
   }

    }

    private static Node1 converto2ddl(int[] a) {
        Node1 head = new Node1(a[0]);
        Node1 prev=head;
        for (int i = 1; i < a.length; i++) {
            Node1 temp=new Node1(a[i], null, prev);
            prev.next=temp;
            prev=temp;
        }





      return head;
    }
}
