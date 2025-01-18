/******************************************************************************

Delete a node from end of the linked list. If linked list is empty then return 
head.
If linked list is not empty then delete node from the end of the linked list and return
the linked list.

*******************************************************************************/

	public static Node deleteEnd(Node head){
	    if(head==null)
	     return head;
	     if(head.next==null)
	     return null;
	    
	         Node curr=head;
	         while(curr.next.next!=null)
	              curr=curr.next;
	              curr.next=null;
	              return head;
	     
	}
