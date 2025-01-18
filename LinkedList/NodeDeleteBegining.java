/******************************************************************************

Delete a node from begining of the linked list. If linked list is empty then return 
head.
If linked list is not empty then delete node from the begining of the linked list and return
the linked list.

*******************************************************************************/

	public static Node deleteHead(Node head){
	    if(head==null)
	     return null;
	     else
	     return head.next;
	}
