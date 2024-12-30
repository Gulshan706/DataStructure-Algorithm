/*
Search data in the given linklist and return the position of the given element
If element present in the linkedlist then return the position otherwise return -1.
*/

class Node{
    int data;
    Node next;
    
    Node(int x){
        data=x;
        next=null;
    
    }
}
class SearchPositionTest{
public static void main (String[] args) {
    
    Node head=new Node(10);
    head.next=new Node(20);
    head.next.next=new Node(34);
    head.next.next.next=new Node(30);
    int pos=searchPosition(head,30);
    System.out.println("pos : "+pos);
}

public static int searchPosition(Node head, int x){
    
    int pos=1;
    while(head!=null){
        if(head.data==x)
        return pos;
        
        pos++;
        head=head.next;
    }
    return -1;
}
}
