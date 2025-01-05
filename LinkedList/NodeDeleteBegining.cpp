/******************************************************************************

Delete a node from begining of the linked list. If linked list is empty then return 
head.
If linked list is not empty then delete node from the begining of the linked list and return
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
Node* deleteBegin(Node* head);
int main(){
   Node *head =new Node(10) ;
   head->next=new Node(20);
   head->next->next=new Node(30);
   head =deleteBegin(head); 
//Print the linked list data
  while(head!=NULL){
   cout << " "<< head->data ; 
   head=head->next;
  }
   
    return 0; 
} 
Node* deleteBegin(Node* head){
    //Handled the base case if head is NULL return the temp as head
    if(head==NULL)
     return  head;
     //If linked lis is not empty
       if(head->next!=NULL)
         head=head->next;
         return head;

}
