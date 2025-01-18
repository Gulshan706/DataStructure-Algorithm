/******************************************************************************

Find the nth node of the linked list from the end

*******************************************************************************/

	public static void findNthFromEnd(Node head,int n){
	    int len=0;
	    Node curr=head;
	    for(curr=head;curr!=null;curr=curr.next)
	       len++;
	    curr=head;
	    for(int i=0;i<len-n;i++)
	        curr=curr.next;
	        
	   System.out.println("Nth node from the end is "+curr.data);
	}
	
