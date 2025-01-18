/******************************************************************************

Find the middle node of the linked list

*******************************************************************************/

	public static void findMidLinkedList(Node head){
	    int cout =0;
	    Node curr=head;
	    for(curr=head;curr!=null;curr=curr.next)
	        cout++;
	        curr=head;
	   for(int i=1;i<=cout/2;i++)
	       head=head.next;
	       // curr=curr.next;
	        
	   System.out.println("Middle of Linked List is "+head.data);     
	}
