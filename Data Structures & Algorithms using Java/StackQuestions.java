public class StackQuestions{
    private static class Node{
int data;
Node next;
Node(int data){
    this.data=data;
    next=null;
}}
static class Stacks{
    public static Node head=null;
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }
    public void push(int data){
 Node newNode=new Node(data);
 if(isEmpty()){
   head=newNode;
   return;
 }      
 newNode.next=head;
 head=newNode;

    }
public int pop(){
    if(isEmpty()){
        return -1;
    }
    int top=head.data;
    head=head.next;
    return top;
}
public int peek(){
    if(isEmpty()){
        return -1;
    }
    int top=head.data;
    return top;
}

//Question 1......To push at Bottom of stack
public void pushAtBottom(int data,Stacks s){
    if(s.isEmpty()){
s.push(data);
return;
    }
    int top=s.pop();
    pushAtBottom(data, s);
    s.push(top);
}

//Quesrtion .2.....To reverse a stack
public void reverseStack(Stacks s){
    if(s.isEmpty()){
        System.out.println("Empty stack");
        return;
    }
    int top=s.pop();
    reverseStack(s);
    s.pushAtBottom(top, s);
}


}

    
public static void main(String[] args) {
 Stacks s=new Stacks();
 s.push(1);
 s.push(2);
 s.push(3);
 s.push(4);
 if(s.isEmpty()){
    System.out.println("Empty");
 }else{
    System.out.println("Items Inside");
  }
//   while(!s.isEmpty()){
//      System.out.println(s.peek());
//      s.pop();
//   }  
s.pushAtBottom(5, s);

// while(!s.isEmpty()){
//     System.out.println(s.peek());
//     s.pop();
//  }  

s.reverseStack(s);

 while(!s.isEmpty()){
     System.out.println(s.peek());
     s.pop();
  }  





}
}