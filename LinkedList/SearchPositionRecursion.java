/* Method will return the position of the search element through recusion call
  If element present in the linked list then return the position of the element 
  If element no present in the linked list the return -1.
  */

public static int searchPosition(Node head, int x){
   
        if(head==null)
           return -1;
        if(head.data==x)
           return 1;   
        else{
         int res= searchPosition(head.next,x);
           if(res== -1)
              return -1;
           else
              return (res+1);
        }
  }
