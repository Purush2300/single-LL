class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }

    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
}


public class Again {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,4,5};
        Node head=twoll(arr);
        head=point(head);
      
        print(head);
    }

    private static Node point(Node head) {
       Node slow=head;
       Node fast=head;
       while (fast!=null && fast.next!=null) {
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    slow=head;
                    while(slow!=fast){
                        slow=slow.next;
                        fast=fast.next;
                    }
                    return slow;
                }

       }
       return null;
    }

    private static void print(Node head) {
Node temp=head;
while (temp!=null) {
    System.out.println(temp.data);
    temp=temp.next;
}
    }

    private static Node twoll(int[] arr) {
        Node head=new Node(arr[0]);
        Node marker=head;
       for (int i = 1; i < arr.length; i++) {
            Node temp=new Node(arr[i]);
            marker.next=temp;
            marker=temp;
       }

       return head;
    }
}
