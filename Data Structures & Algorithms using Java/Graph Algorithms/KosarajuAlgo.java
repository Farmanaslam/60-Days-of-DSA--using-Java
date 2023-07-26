import java.util.ArrayList;
import java.util.Stack;

public class KosarajuAlgo {
    static class Edge{
        int src;
        int dest;
       public  Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[],int v){
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }
        graph[1].add(new Edge(1, 3 ));
        graph[2].add(new Edge(2, 1 ));
        graph[3].add(new Edge(3, 2));
        graph[3].add(new Edge(3, 4));
            }
    public static void topSort(ArrayList<Edge> graph[],int curr,boolean vis[],Stack<Integer> s){
        
            vis[curr]=true;
            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                if(!vis[e.dest]){
                    topSort(graph, e.dest, vis, s);
                }
            
        }
        s.push(curr);
    }
    public static  void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
vis[curr]=true;
System.out.print(curr+" ->");
for(int i=0;i<graph[curr].size();i++){
Edge e=graph[curr].get(i);
if(!vis[e.dest]){
    dfs(graph, e.dest, vis);
}
}
    }

    public static  void kosaraju(ArrayList<Edge> graph[],int v){
      Stack<Integer> s=new Stack<>();
      boolean vis[]=new boolean[v];
      //step 1 push the sorted graph in stack
      for(int i=0;i<v;i++){
        if(!vis[i]){
            topSort(graph, i, vis, s);
        }
      }
      //step 2 create the transpose graph
      ArrayList<Edge> transpose[]=new ArrayList[v];
      for(int j=0;j<v;j++){
        vis[j]=false;
        transpose[j]=new ArrayList<>();
          }
          for(int k=1;k<v;k++){
            for(int f=0;f<graph[k].size();k++){
                Edge e=graph[k].get(f);
                transpose[e.dest].add(new Edge(e.dest, e.src));
            }
          }
          //Step 3 perform dfs
      while(!s.isEmpty()){
        int curr=s.pop();
        if(!vis[curr]){
            System.out.println("SCC: ");
            dfs(transpose, curr, vis);
            System.out.println();
        }
      }
      System.out.println();
      
    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph,v);
        kosaraju(graph,v);

    }
}
