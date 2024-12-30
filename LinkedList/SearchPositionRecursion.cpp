/******************************************************************************

  Method will return the position of the search element through recusion call
  If element present in the linked list then return the position of the element 
  If element no present in the linked list the return -1.

*******************************************************************************/

#include<iostream>
using namespace std;

struct Node{
    int data;
    Node *next;
    
    Node(int x){
        data=x;
        next=NULL;
    
    }
};
int searchPosition(Node *head, int x);
int main () {
    
    Node *head=new Node(10);
    head->next=new Node(20);
    head->next->next=new Node(34);
    head->next->next->next=new Node(30);
    int pos=searchPosition(head,30);
    cout << "pos "<< pos ;
    return 0;
}

int searchPosition(Node *head, int x){
   
        if(head==NULL)
           return -1;
        if(head->data==x)
           return 1;   
        else{
         int res= searchPosition(head->next,x);
           if(res== -1)
              return -1;
           else
              return (res+1);
        }
  }
