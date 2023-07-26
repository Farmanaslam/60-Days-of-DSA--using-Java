import java.util.*;
public class Dijkstra {
    public static class Edge{
int src;
int dest;
int wt;
public Edge(int s,int d,int wt){
    this.src=s;
    this.dest=d;
    this.wt=wt;
}}
    //create a graph to perform dijkstra
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));
        
        graph[2].add(new Edge(2, 4, 3));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }
    
//make pair with nodes and weight
public static  class Pair implements Comparable<Pair>{
    int node ;
    int dist ;
    public Pair(int n,int d){
        this.node=n;
        this.dist=d;
    }
        @Override
        public int compareTo(Pair p2) {
            
            return this.dist-p2.dist;
        }
    
    }
        


    public static  int[] dijkstra(ArrayList<Edge> graph[],int src){
    PriorityQueue<Pair> pq=new PriorityQueue<>();
    int dis[]=new int[graph.length];
    boolean vis[]=new boolean[graph.length];
    for(int i=0;i<graph.length;i++){
        if(i!=src){
            dis[i]=Integer.MAX_VALUE;
        }
    }
    pq.add( new Pair(src,0));

    while(!pq.isEmpty()){
        Pair curr=pq.remove();
        if(!vis[curr.node]){
            vis[curr.node]=true;
            for(int i=0;i<graph[curr.node].size();i++){
                Edge e=graph[curr.node].get(i);
                int u=e.src;
                int v=e.dest;

                //Relaxation
               if(!vis[v] && dis[u]+e.wt<dis[v]){
                dis[v]=dis[u]+e.wt;
                pq.add(new Pair(v, dis[v]));
               }
            }
        }
       
    }
    return dis;
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[]=new ArrayList[6];
        createGraph(graph);
        int[] shortpath=dijkstra(graph, 0);
        for(int i=0;i<shortpath.length;i++){
            System.out.print(shortpath[i]+" ->");
        }
    }
}
