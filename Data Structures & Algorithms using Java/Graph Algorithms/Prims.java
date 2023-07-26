import java.util.*;
public  class Prims{
public static class Edge{
int src;
int dest;
int wt;
public  Edge(int s,int d,int w){
    this.src=s;
    this.dest=d;
    this.wt=w;
}
}
public static class Pair implements Comparable<Pair>{
    int node;
    int cost;
    public Pair(int n,int c)
{
    this.node=n;
    this.cost=c;
}   
     @Override
      public int  compareTo(Pair p2){
        return this.cost-p2.cost;
      }
}
public static void createGraph(ArrayList<Edge> graph[],int v){
    for(int i=0;i<graph.length;i++){
        graph[i]=new ArrayList<>();
    }
    graph[0].add(new Edge(0, 1, 10));
    graph[0].add(new Edge(0, 2, 15));
    graph[0].add(new Edge(0, 3, 30));
    graph[1].add(new Edge(1, 3, 40));
    graph[2].add(new Edge(2, 3, 50));
}

public static void primsAlgo(ArrayList<Edge> graph[],int v){
    int cost=0;//Initialising cost with 0
    PriorityQueue<Pair> pq=new PriorityQueue<>();
    pq.add(new Pair(0, 0));
    boolean vis[]=new boolean[v];
    while(!pq.isEmpty()){
        Pair curr=pq.remove();
        if(!vis[curr.node]){
            vis[curr.node]=true;
            cost+=curr.cost;
            for(int i=0;i<graph[curr.node].size();i++){
             Edge e=graph[curr.node].get(i);
             if(!vis[e.dest]){
                pq.add(new Pair(e.dest, e.wt));
             }
            }

        }
    }
    System.out.println("TOTAL COST FOR MST IS:"+cost);
}

    public static void main(String[] args) {
        int v=4;
                ArrayList<Edge> graph[]=new ArrayList[v];
                createGraph(graph, v);
                primsAlgo(graph, v);

    }
}