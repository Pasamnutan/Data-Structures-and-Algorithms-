//Singly Linked list 

class Node{
    int data;
    Node Next;
    
    // constructor 
    
    Node(int data)
    {
        this.data = data;
        this.Next = null;   
    }
}


public class SinglyLinkedList{
 
 // InsertAtBegin
 
    Node head;
 
 public void InsertAtBegin(int data){
     Node newNode = new Node(data); // creating an node 
     newNode.Next = head;
     head = newNode;
 }
 
 public void display(){
     Node temp = head;
     
     while(temp!=null){
         System.out.print(temp.data + " -> ");
         temp = temp.Next;
     }
     
     System.out.println("null");
 }
 // insertAtEnd
 
 public void InsertAtEnd(int data){
     Node newNode = new Node(data);
    
     Node temp = head;
    
     while(temp.Next!=null){
         temp = temp.Next;
     }    
     
     temp.Next = newNode;
 }

   public static void main(String[] args){
     SinglyLinkedList list = new SinglyLinkedList();
     
     list.InsertAtBegin(10);
     list.InsertAtBegin(20);
     list.InsertAtBegin(30);
     list.InsertAtBegin(40);
     list.InsertAtBegin(50);
     
   

     
     list.display();
   }
    
}