/******************************************************************************

Insert the a node the end of the linked list. If linked list is empty then return 
head.
If linked list is not empty then insert node in the end of the linked list and return
the linked list.

*******************************************************************************/
#include <iostream>
using namespace std;
struct Node{
    int data;
   struct Node *next;
    
    Node(int x){
        data=x;
        next=NULL;
    
    }
};
Node* insertLast(Node* head,int x);
int main(){
   Node *head =new Node(10) ;
   head->next=new Node(20);
   head->next->next=new Node(30);
   head =insertLast(head,31); 
//Print the linked list data
  while(head!=NULL){
   cout << " "<< head->data ; 
   head=head->next;
  }
    return 0; 
} 
Node* insertLast(Node* head, int x){
    Node *temp= new Node(x);
    Node *current=head;
    //Handled the base case if head is NULL return the temp as head
    if(head==NULL)
     return  temp;
     //If linked lis is not empty
       while(current->next!=NULL)
         current=current->next;
         current->next=temp;
         return head;
}
