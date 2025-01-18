/******************************************************************************

Insert a node at the given position in the link list and return new link list.

*******************************************************************************/

	public static Node insertAtPosition(Node head, int data, int pos){
	    Node temp =new Node(data);
	    if(pos==1){
	    temp.next=head;
	    return temp;
	    }
	    Node curr=head;
	    for(int i=1;i<=pos-2&&curr!=null;i++)
	                curr=curr.next;
	                
	       if(curr==null)
	       return head;
	       
	           temp.next=curr.next;
	           curr.next=temp;
	                
	      return head;
	}
