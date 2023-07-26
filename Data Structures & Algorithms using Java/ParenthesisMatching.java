import java.util.*;
public class ParenthesisMatching {
    public static  class Node{
        char data;
        Node next;
        Node(char data){
            this.data=data;
           next=null;
        }
    }
    public static  class Stack{
        public Node head=null;
        public boolean isEmpty(){
            return head==null;
        }
        public void  push(char data){
            Node n= new Node(data);
            if(head==null){
                head=n;
                return;
            }
            n.next=head;
            head=n;

        }
        public char pop(){
            if(isEmpty()){
                return '-';
            }
            char ans=head.data;
            head=head.next;
            return ans;
        }
    }
    public static boolean parenthesisMatch(String pm){
          Stack s=new Stack();
          for(int i=0;i<pm.length();i++){
            if(pm.charAt(i)=='('){
                s.push(pm.charAt(i));
            }else if(pm.charAt(i)==')'){
                if(s.isEmpty()){
                    return false;
                }else{
                    s.pop();
                }
            }
          }
          if(s.isEmpty()){
            return true;
          }
          return false;
    }
    
    public static void main(String[] args) {
       //check whther this parenthesis are matching or not.........
       String pm="(20+2)(40+80)";
       if(parenthesisMatch(pm)){
        System.out.println("Parenthesis are Matched");
       }else{
        System.out.println("Parenthesis are not matching!!");
       }
       

    }
}
