import java.util.*;
public class GraphMore {
    public static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void createUndirGraph(ArrayList<Edge> undirgraph[]){
        for(int i=0;i<undirgraph.length;i++){
            undirgraph[i]=new ArrayList<>();
        }
        undirgraph[0].add(new Edge(0, 1));
        undirgraph[0].add(new Edge(0, 4));
        undirgraph[1].add(new Edge(1, 0));
        undirgraph[1].add(new Edge(1, 2));
       undirgraph[1].add(new Edge(1, 4));
        undirgraph[2].add(new Edge(2, 1));   
        undirgraph[2].add(new Edge(2, 3));
        undirgraph[3].add(new Edge(3, 2));
        undirgraph[4].add(new Edge(4, 0));
       undirgraph[4].add(new Edge(4, 1));
        undirgraph[4].add(new Edge(4, 5));
       
        
        undirgraph[5].add(new Edge(5, 4));
    }

    public static  boolean isCyclic(ArrayList<Edge> undirgraph[],int curr,boolean vis[],int parent){
        //if vis[curr]=true and it is not parent of any node then it statisfies cycle condition
        vis[curr]=true;
        for(int i=0;i<undirgraph[curr].size();i++){
            Edge e=undirgraph[curr].get(i);
            if(vis[e.dest]==true && e.dest!=parent){
return true;//cyclic graph condition
 }
 if(!vis[e.dest]){
    if(isCyclic(undirgraph, e.dest, vis, curr)){
        return true;
    }
 }
        }
        return false;
    }
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
ArrayList<Edge> undirgraph[]=new ArrayList[6];
createUndirGraph(undirgraph);
boolean vis[]=new boolean[6];
if(isCyclic(undirgraph,0,vis,-1)){
    System.out.println("Graph is cyclic ");
}else{
    System.out.println("Graph is not cyclic");
}
    }
    
}
