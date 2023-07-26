

public class Queues {
   static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }}
     static class Queue{
    static Node head=null;
    static Node tail=null;

    //isempty function......
    public boolean isEmpty(){
return head==null && tail==null;
    }

    //inserting in a queue
    public void enQueue(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }
    //removing from queue
public int deQueue(){
    if(isEmpty()){
        System.out.println("Empty Queue ");
        return -1;
    }
    int top=head.data;
    //if contains single Node
    if(head==tail){
        tail=null;
    }
    head=head.next;
    return top;
}

//peek value of queue
public int peek(){
    if(isEmpty()){
        System.out.println("Empty queue");
        return -1;
    }
    return head.data;
}
}

   public static void main(String[] args) {
Queue q =new Queue();
q.enQueue(10);
q.enQueue(20);
q.enQueue(30);


//traversing queue........
while(!q.isEmpty()){
    System.out.println(q.peek());
    q.deQueue();
}
if(q.isEmpty()){
    System.out.println("Empty");
}else{
    System.out.println("Not empty");
}
   }
}
