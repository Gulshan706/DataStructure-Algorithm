
class Node{
    int data;
    Node next;
    
    Node(int x){
        data=x;
        next=null;
    
    }
}
class InserBegining{
public static void main (String[] args) {
    Node head=null;
    head=insertBegin(head,20);
    head=insertBegin(head,30);
    head=insertBegin(head,40);
    head=insertBegin(head,50);
    head=insertBegin(head,60);
    while(head!=null) {
        System.out.print(head.data+" ");
         head=head.next;
  }
}
public static Node insertBegin(Node head, int x){
    Node temp=new Node(x);
    temp.next=head;
    return temp;

}
}
