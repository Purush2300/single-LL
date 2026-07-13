class Node{
    int data;
    Node next;

   
    public Node(int data){
        this.data=data;
        this.next=null;
    }
    public Node(int data,Node next){
        this.data=data;
        this.next=null;
    }

    
}




public class july133 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        Node head=single(arr);
    //     printMsg(head);
    //    head= insertFirst(head,10);
    //      printMsg(head);
        // head=insertBetween(head,30,3);
        //  printMsg(head);
    //    head= insertLast(head,6);
        // printMsg(head);
        // head=deleteFirst(head);
        //    printMsg(head);
    //    head= deletemiddle(head,2);
        
       head= deleteLast(head);
        printMsg(head);
    }

    private static Node single(int[] arr) {
        Node head=new Node(arr[0]);
        Node temp=head;
       
            for(int i=1;i<arr.length;i++){
                Node newNode=new Node(arr[i]);
                temp.next=newNode;
                temp=temp.next;
            }
        return head;
    }

    private static void printMsg(Node head) {
        Node temp=head;

        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next; 
            
        }
        
    }

    private static Node insertFirst(Node head, int i) {
       Node newNode=new Node(i);
       
        newNode.next=head;
        head=newNode;
        return head;
    }

    private static Node insertBetween(Node head, int value, int position) {
       Node NewNode=new Node(value);
      
       Node temp=head;
    
        for(int i=1;i<position-1;i++){
            temp=temp.next;
        }
       
        NewNode.next=temp.next;
        temp.next=NewNode;


        return head;
    }

    private static Node insertLast(Node head, int i) {
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node newNode=new Node(i);
        temp.next=newNode;
        
        return head;
    }

    private static Node deleteFirst(Node head) {
       head=head.next;
       return head;
    }

    private static Node deletemiddle(Node head, int pos) {
       Node temp=head;
       for(int i=0;i<pos-1;i++){
        temp=temp.next;
       }
       temp.next=temp.next.next;
       return head;
    }

    private static Node deleteLast(Node head) {
       Node temp=head;
       while(temp.next.next!=null){
        temp=temp.next;
       }
       temp.next=null;
       return head;
    }

    
}
