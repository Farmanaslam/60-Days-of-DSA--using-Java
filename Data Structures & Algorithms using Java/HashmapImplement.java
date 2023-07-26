import java.util.*;
import java.util.LinkedList;
public class HashmapImplement {
static class HashMap<K,V>{
    private class Node{
         K key;
        V value;
        
    public  Node(K key,V value){
        this.key=key;
        this.value=value;
            }

    }

    private int N;//Size of array //buckets
    private int n;//size of nodes
   private LinkedList<Node> buckets[];
      
    @SuppressWarnings("unchecked")
    
    public  HashMap(){
this.N=4;
this.buckets=new LinkedList[4];
for(int i=0;i<4;i++){
    this.buckets[i]=new LinkedList<>();
}

    }
    private int hashFunction(K key){
      int bi=key.hashCode();
      return Math.abs(bi) % N;
    }
    private int searchInLl(K key,int  bi){
LinkedList<Node> ll=buckets[bi];
for(int i=0;i<ll.size();i++){
if(ll.get(i).key ==key){
    return i;
}}
    return -1;

}

@SuppressWarnings("unchecked")
public void rehash(){
    LinkedList<Node> oldbucket[]=buckets;
    buckets=new LinkedList[N*2];
for(int i=0;i<N*2;i++){
    buckets[i]=new LinkedList<>();
}
for(int i=0;i<oldbucket.length;i++){
LinkedList<Node> ll=oldbucket[i];
for(int j=0;j<ll.size();j++){
Node node=ll.get(j);
put(node.key,node.value);
}
}

}
    

    public void put(K key, V value){
int bi=hashFunction(key);//hashfunction will return bucket index
int di=searchInLl(key,bi);//data index or index of Node
if(di==-1){
    //make new node
    buckets[bi].add(new Node(  key,   value));
}else{
    Node data=buckets[bi].get(di);
    data.value=value;
}
double lambda=(double)n/N;
if(lambda>=2.0){
    rehash();
}
    }
public  boolean containsKey(K key){
    int bi=hashFunction(key);
    int di=searchInLl(key,bi);
    if(di==-1){
        return false;
    }
    return true;
}

public V remove(K key){
    int bi=hashFunction(key);
    int di=searchInLl(key, bi);
    if(di==-1){
        return null;
    }else{
        Node node=buckets[bi].remove(di);
        n--;
        return node.value;
    }
}
public V get(K key){
    int bi=hashFunction(key);
    int di=searchInLl(key, bi);
    if(di==-1){
        return null;
    }else{
        Node node=buckets[bi].get(di);
        return node.value;
    }
}
public ArrayList<K> keySet(){
    ArrayList<K> keys=new ArrayList<>();
    for(int i=0;i<buckets.length;i++){
        LinkedList<Node> ll=buckets[i];
        for(int j=0;j<ll.size();j++){
            Node node=ll.get(j);
            keys.add(node.key);
        }
    }
    return keys;
}
public boolean isEmpty(){
    return n==0;
}

public V containsValue(K key){
    int bi=hashFunction(key);
    int di=searchInLl(key, bi);
    if(di==-1){
        return null;
    }else{
        Node node=buckets[bi].get(di);
        return node.value;
    }

}

}


    public static void main(String[] args) {
       HashMap<String , Double> map=new HashMap<>();
       map.put("India", 200.0);
       map.put("China", 300.0);
       map.put("Canada", 700.0);
System.out.println(map);

ArrayList<String> keys=map.keySet();
for(int i=0;i<keys.size();i++){
    System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
}

double n=map.get("India");
System.out.println(n);
 
System.out.println(keys);
map.remove("China");
System.out.println(map.get("China"));

if(map.isEmpty()){
    System.out.println("Empty Hashmap");
}else{
    System.out.println("HashMap Contain Values");
}

double data=map.containsValue("India");
System.out.println(data);
    }
}
