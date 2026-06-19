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







public class June19 {
    public static void main(String[] args) {
        int[]arr={10,20,30,40,50};
        Node head=toSinglell(arr);
    
        //    delete tail
        // head=deleteOfHead(head);
        //   print(head);

        // // delete tail
        // head=deleteTail(head);
        // print(head);  

        // delete kth position

        // head=deleteKthPosition(head,3);
        // print(head);  

        // delete paticular value;
        // head =deleteValue(head,4);
        // print(head);

        // insert head at begining
        head=new Node(100,head);
         print(head);
    }

    private static Node toSinglell(int[] arr) {
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;

    }

    private static void print(Node head) {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    private static Node deleteOfHead(Node head) {
        if(head==null) return head;
        head=head.next;
        return head;
    }

    private static Node deleteTail(Node head){
        if(head==null||head.next==null) return null;
        Node temp=head;

        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    private static Node deleteKthPosition(Node head, int i) {
       if(head == null) return null;
       if(i==1){
        head=head.next;
        return head;
       }
       Node temp=head;
       Node prev=null;
       int cnt=0;
       while(temp!=null){
            cnt++;
            if(cnt==i){
                prev.next=temp.next;
                break;
            }
            prev=temp;
            temp=temp.next;
       }
       return head;
    }

    private static Node deleteValue(Node head, int i) {
        if(head==null) return null;
        if(head.data==i){
            return head.next;
        }
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            if(temp.data==i){
                prev.next=prev.next.next;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
}
