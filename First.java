class Node{
    int data;
    Node next;
    Node(int val){
        this.data=val;
        this.next=null;
    }
}


public class First {

    public static void main(String[] args) {
        int[]a={10,2,3,4,5};
        Node head=converttoll(a);
        Node temp=head;
        // lltraversal(temp);
    head= removehead(head);
    head=deletetail(head);
   print(head);
        // System.out.println(countll(temp));
        // System.out.println(search(temp,5));


    }

    private static Node  deletetail(Node head) {
        if(head==null||head.next==null){
            return null;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;


        return head;
    }

    private static Node removehead(Node head) {
     if(head==null){
        return head;
     }
      head=head.next;
      return head;
    }

    private static boolean search(Node temp, int i) {
            while (temp!=null) {
                if(temp.data==i){
                    return true;
                }
                temp=temp.next;
            }


        return false;
        
    }

    private static int countll(Node temp) {
        int cnt=0;
        while (temp!=null) {
            cnt++;
            temp=temp.next;
        }
        return cnt;
        
    }

    private static void print(Node temp) {
       while (temp!=null) {
        System.out.print(temp.data+" ");
        temp=temp.next;
       }
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
}