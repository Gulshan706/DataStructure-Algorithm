/*
Search data in the given linklist and return the position of the given element
If element present in the linkedlist then return the position otherwise return -1.
*/

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
int searchPosition(Node* head,int x);
int main(){
    
    Node *head=new Node(10);
    head->next=new Node(20);
    head->next->next=new Node(34);
    head->next->next->next=new Node(30);
    int pos=searchPosition(head,30);
    cout << "pos : "<< pos ;
    return 0;
}
int searchPosition(Node* head, int x){
    
    int pos=1;
    while(head!=NULL){
        if(head->data==x)
        return pos;
        
        pos++;
        head=head->next;
    }
    return -1;
}
