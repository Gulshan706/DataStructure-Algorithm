class Node{
    int data;
    Node next;
    
    Node(int x){
        data=x;
        next=null;
    }
}

class NodeTest{
    public static void main (String[] args) {

    Node head=new Node(10);
   /* 
   Node temp1=new Node(20);
    Node temp2= new Node(30);
    Node temp3=new Node(40);
    
    head.next=temp1;
    temp1.next=temp2;
    temp2.next=temp3;
    */
    Node head=new Node(10);
    head.next=new Node(20);
    head.next.next= new Node(30);
    head.next.next.next=new Node(40);
        
    printList(head);
    
}

public static void printList(Node head){
    
    while(head!=null){
       System.out.print(head.data +" ");
      head=  head.next;
    }
    
 }
}
