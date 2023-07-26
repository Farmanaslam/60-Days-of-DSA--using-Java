import java.util.*;

public class CycleDetection{
    public static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void createdirgraph(ArrayList<Edge> dirgraph[]){
    for(int i=0;i<dirgraph.length;i++){
        dirgraph[i]=new ArrayList<Edge>();
    }
    dirgraph[0].add(new Edge(0, 2));
    dirgraph[1].add(new Edge(1, 0));
    dirgraph[2].add(new Edge(2, 3));
    dirgraph[3].add(new Edge(3, 0)); 

}
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 6));        

    }
    public static  void printAllPath(ArrayList<Edge> graph[],int src,int tar,String path,boolean vis[]){
if(src==tar){
    System.out.println(path);
    return;
}
for(int i=0;i<graph[src].size();i++){
    Edge e=graph[src].get(i);
    if(vis[e.dest]==false){
        vis[e.dest]=true;
    printAllPath(graph, e.dest, tar, path+" ->"+e.dest, vis);
    vis[e.dest]=false;
}}
    }

    //Cycle detection in a directed graph..........
    public static boolean cycleDetect(ArrayList<Edge> dirgraph[],int curr, boolean visit[],boolean rec[]){
        visit[curr]=true;
        rec[curr]=true;
        for(int i=0;i<dirgraph[curr].size();i++){
            Edge e=dirgraph[curr].get(i);
            if(rec[e.dest]==true){
                return true;//Cycle condition
            }else if(!visit[e.dest]){
                if(cycleDetect(dirgraph, e.dest, visit, rec)){
                      return true;
                }
            }
        }
        rec[curr]=false;
        return false;
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
}
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
        int vertex=7;
        ArrayList<Edge> graph[]=new ArrayList[vertex];
        //Create a graph
        createGraph(graph);
        int src=0;
        int tar=5;
        //print all path between source and target in graph
       boolean vis[]=new boolean[vertex];
       
        printAllPath(graph,src,tar,"0",vis);

        //Cycle detection in a directed graph.........
        int v=4;
        ArrayList<Edge> dirgraph[]=new ArrayList[v];
        createdirgraph(dirgraph);
     boolean visit[]=new boolean[v];
     boolean rec[]=new boolean[v];

if(cycleDetect(dirgraph, 0, visit, rec)){
    System.out.println("It is Cycle Graph");
}else{
    System.out.println("Not cycled graph");
}


//Topological sorting in a graph
ArrayList<Edge> dag[]=new ArrayList[6];
topologicalSort(dag);



    }
}}