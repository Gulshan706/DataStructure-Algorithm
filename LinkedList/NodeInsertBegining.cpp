/******************************************************************************

Insert a node in the begining of the linked list and print the linked list data

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
Node* insertBegin(Node* head,int x);
int main(){
    
    Node *head=NULL;
    head=insertBegin(head,20);
    head=insertBegin(head,30);
    head=insertBegin(head,40);
    head=insertBegin(head,50);
    head=insertBegin(head,60);
    while(head!=NULL) {
         cout << head->data<< " ";
         head=head->next;
  }
    return 0;
}
Node*  insertBegin(Node* head, int x){
    Node *temp =new Node(x);
    temp->next=head;
    return temp;
  
}
