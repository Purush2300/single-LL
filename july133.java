class Node{
    int data;
    Node next;

   
    public Node(int data){
        this.data=data;
        this.next=null;
    }
    
}




public class july133 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        Node head=single(arr);
        printMsg(head);
        insertFirst(head);
        insertBetween(head);
        insertLast(head);
        deleteFirst(head);
        deletemiddle(head);
        deleteLast(head);
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

    private static void insertFirst(Node head) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
