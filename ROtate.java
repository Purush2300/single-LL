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
public class ROtate {
    public static void main(String[] args) {
      int[]a={10,100,30,40,50};
      Node head=convert2ll(a);
    //   head=first(head);
    //   head=del(head);
    // head=delposition(head,50);
   head =insertposition(head,12,1);
//    head=insertBeforeValue(head,39,40);
      print(head);

    }

  

    


    private static Node insertBeforeValue(Node head, int ele, int val) {
        if(head==null){
            return null;
        }
        if(head.data==val){
            Node newnode=new Node(ele);
            newnode.next=head;
            
            return newnode;
        }
            Node temp=head;
        while(temp.next!=null){
            if(temp.next.data==val){
                Node insert=new Node(ele);
                insert.next=temp.next;
                temp.next=insert;
                break;
        }
    }
        temp=temp.next;

      return head;
    }






    private static Node insertposition(Node head, int element, int j) {
        if(head==null){
            if(j==1){
                return new Node(element);
                
            }
            else{
                return null;
            }
        }
        if(j==1){
            Node newnode=new Node(element);
            newnode.next=head;
            return newnode;
        }
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            cnt++;
            if(cnt==j-1){
                Node newnode=new Node(element);
                newnode.next=temp.next;
                temp.next=newnode;
                break;
            }
        }
        temp=temp.next;






     return head;
    }






    private static Node delposition(Node head, int j) {

        if(head==null){
            return null;
        }
        if(head.data==j){
            head=head.next;
            return head;

        }
        Node temp=head;
       
        Node prev=null;
        while(temp!=null){
           
            if(temp.data==j){
                prev.next=prev.next.next;
            }
            prev=temp;
            temp=temp.next;
        }

        return head;
    
    }






    private static Node del(Node head) {
        if(head==null||head.next==null){
            return null;
        }
        Node temp=head;
        while (temp.next.next!=null) {
            temp=temp.next;
        }
        temp.next=null;
       return head;
    }

    private static Node first(Node head) {
        head=head.next;
       return head;
    }

    private static void print(Node head) {
        Node temp=head;
       while (temp!=null) {
        System.out.print(temp.data+" ");
        temp=temp.next;
       }
    }

    private static Node convert2ll(int[] a) {
        Node head = new Node(a[0]);
        Node mark=head;
        for (int i = 1; i < a.length; i++) {
            Node temp=new Node(a[i]);
            mark.next=temp;
            mark=temp;

        }
            return head;
    }
}
