/******************************************************************************

Insert a node at the shorted position in the link list and return new link list.

*******************************************************************************/

	public static Node insertAtSortedPos(Node head, int data){
	    Node temp=new Node(data);
	    if(head==null)
	    return temp;
	    if(data<head.data){
	          temp.next=head;
	          return temp;
	       }
	   Node curr =head; 
	   while(curr.next!=null&& curr.next.data<data)
	          curr=curr.next;
	          temp.next=curr.next;
	          curr.next=temp;
	       return head;
	    
	}
