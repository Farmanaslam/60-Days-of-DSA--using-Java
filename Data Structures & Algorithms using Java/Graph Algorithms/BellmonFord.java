import java.util.*;
public class BellmonFord {
    public static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int wt){
            this.src=s;
            this.dest=d;
            this.wt=wt;
        }}
   //creating a graph in which weight can have negative values....
   public static void createGraph(ArrayList<Edge> graph[]){
    for(int i=0;i<graph.length;i++){
        graph[i]=new ArrayList<>();
    }
graph[0].add(new Edge(0, 1, 2));
graph[0].add(new Edge(0, 2, 4));
graph[1].add(new Edge(1, 2, -4));
graph[2].add(new Edge(2, 3, 2));
graph[3].add(new Edge(3, 4, 4));
graph[4].add(new Edge(4, 1, -1));

   }        

   //Belman ford used to calculate shortest path when weight of edge can have negative values....

   public static int[] bellmanFord(ArrayList<Edge> graph[],int v,int src){
int dis[]=new int[v];
for(int i=0;i<v;i++){
    if(i!=src){
        dis[i]=Integer.MAX_VALUE;
    }
}
for(int k=0;k<v-1;k++){
    for(int i=0;i<v;i++){
        for(int j=0;j<graph[i].size();j++){
            Edge e=graph[i].get(j);
            int u=e.src;
            int V=e.dest;
        if(dis[u]!=Integer.MAX_VALUE && dis[u]+e.wt<dis[V]){
            dis[V]=dis[u]+e.wt;
        }
        }
    }
}
     return dis;

   } 
    public static void main(String[] args) {
        int v=5;
        ArrayList<Edge> graph[] =new ArrayList[v];
        createGraph(graph);
int path[]=bellmanFord(graph, v, 0);
for(int i=0;i<path.length;i++){
    System.out.print(path[i]+" ");
}

    }
}
