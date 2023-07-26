import java.util.*;
public class Bridge {
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
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 2));      
        
        graph[3].add(new Edge(3, 4));
        System.out.println("Graph created");
    }
    public static void dfstarjan(ArrayList<Edge> graph[],int curr,boolean vis[],int dt[],int ldt[],int time,int par){
        vis[curr]=true;
        dt[curr]=ldt[curr]=++time;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(e.dest==par)
                continue;
                if(vis[e.dest]){
                    ldt[curr]=Math.min(ldt[curr], dt[e.dest]);
                }
             else{
                dfstarjan(graph,e.dest, vis, dt, ldt, time, curr);
                ldt[curr]=Math.min(ldt[curr],ldt[e.dest]);
                if(dt[curr]<ldt[e.dest]){
                    System.out.println("Bridge is:"+curr+"----"+e.dest);
                }
            }
        
        }
        }





    public static void getBridge(ArrayList<Edge> graph[],int v){
int dt[]=new int[v];
int ldt[]=new int[v];
int time=0;
boolean vis[]=new boolean[v];
for(int i=0;i<v;i++){
    if(!vis[i]){
        dfstarjan(graph,i,vis,dt,ldt,time,-1);
    }
}
    }
    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge> graph[]=new ArrayList[v]; 
        createGraph(graph, v);
        getBridge(graph, v);
    }
}
