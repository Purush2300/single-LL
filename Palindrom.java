class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
    Node(int data){
        this.data=data;
        this.next=null;
    }
}   




public class Palindrom {
    public static void main(String[] args) {
        int[]k={1,2,3,2,1};
        Node head=twoll(k);
      System.out.println(ispalindrom(head));
    }

    private static boolean ispalindrom(Node head) {
        if (head == null || head.next == null)
         return true;
       Node slow=head;
       Node fast=head;
       while (fast.next!=null && fast.next.next!=null) {
        slow=slow.next;
        fast=fast.next.next;
       }
       Node secondhalf=reve(slow.next);

    Node first=head;
    Node second=secondhalf;
       while (second!=null) {
        if(first.data!=second.data){
            reve(secondhalf);
            return false;
        }
        first=first.next;
        second=second.next;
       }
       reve(secondhalf);
       return true;
    }

    private static Node reve(Node head) {
        if(head==null){
            return null;
        }
      Node temp=head;
      Node prev1=null;
      while (temp!=null) {
        Node front=temp.next;
        temp.next=prev1;
         prev1=temp;
        temp=front;
       
      }
      return prev1;
    }

    private static void display(Node head) {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    private static Node twoll(int[] k) {
        Node head = new Node(k[0]);
        Node mark=head;
        for (int i = 1; i < k.length; i++) {
            Node temp=new Node(k[i], null);
            mark.next=temp;
            mark=temp;
        }
        return head;
     }
}
