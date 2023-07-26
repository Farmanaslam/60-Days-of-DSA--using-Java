import java.util.*;

public class TopSort{
    public static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }

    //Topological sort in a graph
    public static void createDag(ArrayList<Edge> dag[]){
for(int i=0;i<dag.length;i++){
    dag[i]=new ArrayList<Edge>();
}
dag[2].add(new Edge(2, 3));
dag[3].add(new Edge(3, 1));
dag[4].add(new Edge(4, 0));
dag[4].add(new Edge(4, 1));    
dag[5].add(new Edge(5, 0));
dag[5].add(new Edge(5, 2));

}
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
}}
public static void topSortUtil(ArrayList<Edge> dag[],int curr,boolean vis[], Stacks s){
    
 vis[curr]=true;
 for(int i=0;i<dag[curr].size();i++){
Edge e=dag[curr].get(i);
if(!vis[e.dest]){
    topSortUtil(dag,e.dest,vis,s);
}
 }
 s.push(curr);
}
public static  void topologicalSort(ArrayList<Edge> dag[]){
    boolean vis[]=new boolean[6];
    Stacks stack=new Stacks();
    for(int i=0;i<dag.length;i++){
        if(!vis[i]){
            topSortUtil(dag, i, vis, stack);
        }
    }

    while(!stack.isEmpty()){
        System.out.println(stack.pop()+"->");
    }
}
   public static void main(String[] args) {

//Topological sorting in a graph
ArrayList<Edge> dag[]=new ArrayList[6];
topologicalSort(dag);





   }}