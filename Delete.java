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
        head=position(head,5);
        print(head);
    }



      private static Node position(Node head, int i) {
        if(head==null){
            return null;
        }
        if(i==1){
           head= head.next;
           return head;
        }
        int cnt=0;
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            cnt++;
            if(cnt==i){
                prev.next=prev.next.next;
            }
            prev=temp;
            temp=temp.next;
        }



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
