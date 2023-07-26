import java.util.*;
import java.util.LinkedList;
public class GraphTraversal {
    public static class Edge{
int src;
int dest;
public Edge(int s,int d){
    this.src=s;
    this.dest=d;
}
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
    //breadth first search traversal........
    public static void bfs(ArrayList<Edge> graph[],int v){
        Queue<Integer> q=new LinkedList<>();
    boolean vis[]=new boolean[v];
        q.add(0);
        while(!q.isEmpty()){
      int currNode=q.remove();
      if(vis[currNode]==false){
        System.out.print(currNode+" ->");
        vis[currNode]=true;

        for(int i=0;i<graph[currNode].size();i++){
            Edge e=graph[currNode].get(i);
            q.add(e.dest);
        }
      }
        }
    }

    //depth first search traversal .................

    public static void dfs(ArrayList<Edge> graph[],int currNode,boolean vis[]){
        System.out.print(currNode+" ->");
        vis[currNode]=true;
        for(int i=0;i<graph[currNode].size();i++){
        Edge e=graph[currNode].get(i);
        if(vis[e.dest]==false){
        dfs(graph, e.dest, vis);
        }}
        
    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);
        bfs(graph, v);
System.out.println();
        //calling dfs
        boolean vis[]=new boolean[v];
                dfs(graph, 0, vis);

    }
}
