/* Recursive function to print the linkedlist data  in java */

public static void printList(Node head){
    
        if(head==null)
           return;
       System.out.print(head.data +" ");
       printList(head.next);
 
 }
