import java.util.*;
public class QueueUsingStack {
    static class Queue{

        //Queue using 2 stacks..........
Stack<Integer> s1=new Stack<Integer>();//stack using collection framework
Stack<Integer> s2=new Stack<Integer>();//stack using collection framework
public boolean isEmpty(){
    return s1.isEmpty();
}

//insert function..........
public void enQueue(int data){
    while(!s1.isEmpty()){
        s2.push(s1.pop());
    }
    s1.push(data);
    while(!s2.isEmpty()){
        s1.push(s2.pop());
    }
}

//removing function............
public int deQueue(){
if(isEmpty()){
    System.out.println("Empty queue");
    return -1;
}
return s1.pop();
}

//peek value of queue..............
public int peek(){
    if(isEmpty()){
        System.out.println("Empty queue");
        return -1;
    }
    return s1.peek();
}
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        if(q.isEmpty()){
            System.out.println("Empty");
        }else{
            System.out.println("Not empty");
        }

        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.deQueue();
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.deQueue();
        }
    }
}
