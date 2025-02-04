/******************************************************************************

Remove the duplicate node from the linked list

*******************************************************************************/

public static Node removeDuplicateSorted(Node head){
	    Node curr=head;
	    while(curr!=null && curr.next!=null){
	        if(curr.data==curr.next.data)
	            curr.next=curr.next.next;
	        else
	           curr=curr.next;
	    }
	    return head;
	}
