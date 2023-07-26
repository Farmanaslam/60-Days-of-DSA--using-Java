public class Multiplebracesmatching {
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
   public static  boolean match(char a,char b){
    if(a=='{' && b=='}'){
        return true;
    }else if(a=='[' && b==']'){
        return true;
    }else if(a=='(' && b==')'){
        return true;
    }
    return false;
   }
   public static  boolean multipleParenthesisMatch(String match){
    char poppedchar;
    Stack s=new Stack();
    for(int i=0;i<match.length();i++){
        if(match.charAt(i)=='(' || match.charAt(i)=='['|| match.charAt(i)=='{'){
           s.push(match.charAt(i));
        }else if(match.charAt(i)==')' || match.charAt(i)==']' || match.charAt(i)=='}'){
            if(s.isEmpty()){
                return false;
            }
            poppedchar=s.pop();
            if(!match(poppedchar, match.charAt(i))){
                return false;
            }
        }
    }
    if(s.isEmpty()){
        return true;
    }
    return false;
   }
    public static void main(String[] args) {
        //check whether the braces are matching or not....
        String match="{[(20+20)(40*2)+80}";
        if(multipleParenthesisMatch(match)){
            System.out.println("Parenthesis Matched...");
        }else{
            System.out.println("Parenthesis NOT Mathced!!! ");
        }
        
    }
}
