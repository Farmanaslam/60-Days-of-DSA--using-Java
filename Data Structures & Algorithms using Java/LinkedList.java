class LinkedList{
Node head;
int listsize=0;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
}}
// creating node or insert at first functionm
public void createNode(int data){
Node newNode=new Node(data);
newNode.next=head;
head=newNode;
listsize++;
}

//to print loinkedlist.......
public void printList(){
    if(head==null){
        System.out.println("List is empty");
    }
    Node currNode=head;
    while(currNode != null){
        System.out.print(currNode.data+" -> ");
        currNode=currNode.next;
    }
System.out.println("null");
}

//Insert at end fuction....
 public void insertAtEnd(int data){
 Node newNode=new Node(data);
 if(head==null){
     head=newNode;
     return;
 }
 Node lastNode=head;
while(lastNode.next != null){
     lastNode=lastNode.next;
     
 }
 lastNode.next=newNode;
 listsize++;
}
//remove firest function............
public void removeFirst(){
    if(head == null){
        System.out.println("Empty list");
        return;
    }
    Node currNode=head;
    head=currNode.next;
listsize--;
}

//Removing last element.......................
public void removeLast(){
    if(head==null){
        System.out.println("Empty list");
        return;
    }
    if(head.next==null){
        head=null;
        return;
    }
    Node currNode=head;
    Node lastNode=head.next;
    while(lastNode.next!=null){
        currNode=currNode.next;
    lastNode=lastNode.next;
    }
currNode.next=null;
listsize--;
}
public  int getListSize(){
    return listsize;
}

//Insert at index function............................
public void insertAtIndex(int index,int data){
    if(index<0 || index>listsize){
        System.out.println("Invalid Index");
        return;
    }
    Node newNode=new Node(data);
    Node currNode=head;
    for(int i=1;i<listsize;i++){
        if(i==index){
            Node nextNode=currNode.next;
            currNode.next=newNode;
            newNode.next=nextNode;
            break;
        }
        currNode=currNode.next;
    }
    listsize++;
}

//Delete at index funtion...........................
public void deleteAtIndex(int index){
Node currNode=head;
Node nextNode=currNode.next;

    for(int i=1;i<=index-1;i++){
       currNode=currNode.next;
       nextNode=nextNode.next;
       
    }
    currNode.next=nextNode.next;
    listsize--;
}
//To reverse a linked list.....................
public void reverseList(){
    if(head==null){
        System.out.println("Empty list");
        return ;
    }
    if(head.next==null){
        System.out.println("list has only head node");
        return ;
    }
Node prevNode=head;
Node currNode=head.next;
while(currNode!=null){
    Node nextNode=currNode.next;
    currNode.next=prevNode;
    prevNode=currNode;
    currNode=nextNode;
}
head.next=null;
head=prevNode;
}


public static void main(String[] args) {
 LinkedList list=new LinkedList();
list.createNode(10);
list.createNode(20);
list.createNode(30);
list.printList();
 list.insertAtEnd(5);
 list.insertAtEnd(0);
list.printList();
list.removeFirst();
list.printList();
list.removeLast();
list.printList();
list.insertAtIndex(1,15 );
 list.printList();
 list.deleteAtIndex(1);
 list.printList();
 int size=list.getListSize();
 System.out.println("The size of your list is "+ size);
 list.reverseList();
 list.printList();
}
}