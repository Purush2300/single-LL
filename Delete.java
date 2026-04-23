class Node{
    int data;
    Node next;
    Node(int val){
        this.data=val;
        this.next=null;
    }
}


public class Delete {
    public static void main(String[] args) {
        int[]a={10,2,3,4,5};
        Node head=converttoll(a);
    //   head=first(head);
    //   head=last(head);
    //   head=position(head,3);
    // head=insertfirst(head,20);

      head=insertend(head,20);
        print(head);
    }



     






      private static Node insertend(Node head, int i) {
            if(head==null){
                return null;
            }
            Node temp=head;
            Node last = new Node(i);
            while (temp.next!=null) {
                temp=temp.next;
            }
            temp.next=last;
            return head;
    }










      private static Node insertfirst(Node head, int i) {
        Node temp=new Node(i);
        temp.next=head;
        return temp;
    }










      private static Node position(Node head, int i) {
           if(head==null||head.next==null){
            return head;
           }
           if(head.data==i){
            head=head.next;
            return head;
           }
           int cnt=0;
           Node prev=null;
           Node temp=head;
           while(temp!=null){
            cnt++;
            if(temp.data==i){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
           }
           return head;
    }










      private static Node last(Node head) {
        if(head==null){
            return head;
        }
        Node temp=head;
        while (temp.next.next!=null) {
            temp=temp.next;
        }
        temp.next=null;

       return head;
    }










      private static Node first(Node head) {

        if(head==null||head.next==null){
            return head;
        }

        head=head.next;
       return head;
    }










      private static Node converttoll(int[] a) {
        Node head=new Node(a[0]);
        Node marker=head;
       for (int i = 1; i < a.length; i++) {
            Node temp=new Node(a[i]);
            marker.next=temp;
            marker=temp;
       }

       return head;


       
        
    }
     private static void print(Node temp) {
       while (temp!=null) {
        System.out.print(temp.data+" ");
        temp=temp.next;
       }
    }
}
