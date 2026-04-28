class Node{
    int data;
    Node next;

    Node(int val){
        this.data=val;
        this.next=null;
    }
    Node(int val,Node next){
        this.data=val;
        this.next=next;
    }
}


public class Leet {
    public static void main(String[] args) {
        int []arr={1,2};
        Node head= toLL(arr);
        // head=middle(head);
        head=reverse(head);
        tprint(head);
    }



































    private static Node reverse(Node head) {
        if(head==null){
            return null;
        }
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            Node front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        


       return prev;
    }



































    private static Node middle(Node head) {
        if(head==null){
            return head;
        }
       
        int len=0;
        Node temp=head;
        while (temp!=null) {
            len++;
           
            temp=temp.next;
        }

        int mid=len/2;
       
        temp=head;
       
       for (int i = 0; i < mid; i++) {
        temp=temp.next;
       }
       return temp;

       }
       
       


      
    



































    private static void tprint(Node head) {
        Node temp=head;
      while(temp!=null){
        System.out.print(temp.data+" ");
      
      temp=temp.next;
    }
    }









    private static Node toLL(int[] arr) {
    Node head = new Node(arr[0]);
        Node mark=head;
        for (int i = 1; i < arr.length; i++) {
            Node temp=new Node(arr[i]);
            mark.next=temp;
            mark=temp;

        }
            return head;
    }
}
