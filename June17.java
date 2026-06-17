








class Node{
    int data;
    Node next;
   public Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}



public class June17 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        
       Node head=converttoll(arr);
       System.err.println(head.data);
       Traversal(head);

    }
    public static Node  converttoll(int[]a){
        Node head=new Node(a[0]);
        
        Node mover=head;
       for(int i=1;i<a.length;i++){
        Node temp =new Node(a[i]);
        mover.next=temp;
        mover=temp;
       }
       return  head;
    }
    public static Node Traversal(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
           temp= temp.next;
        }
        return temp;
    }
}
