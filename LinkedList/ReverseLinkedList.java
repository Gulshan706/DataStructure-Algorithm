/******************************************************************************

Reverse the given linked list

*******************************************************************************/

	public static Node reverseLinkedList(Node head){
	    Node curr=head;
	    Node previous=null;
	    Node next;
	    while(curr!=null){
	        next=curr.next;
	        curr.next=previous;
	        previous=curr;
	        curr=next;
	    }
	    return previous;
	    
	}
	
	public static Node reverseLinkedListRec(Node head){
	    if(head==null || head.next==null)
	       return head;
	   
	    Node newHead= reversLinkedListRec(head.next);
	    Node tailHead= head.next;
	         tailHead.next=head;
	         head.next=null;
	         return newHead;
	       
	    
	}
