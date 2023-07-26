import java.util.*;
import java.util.HashSet;

public   class HashSets{
    public static void main(String[] args) {
       HashSet<Integer> set=new HashSet<Integer>();
       //Adding in hashset
       set.add(1);
       set.add(10);
       set.add(1);
       set.add(20);
       //printing set..........
       System.out.println(set);
       //Deleting from set...........
       set.remove(1);
       System.out.println(set);
       //checking for an element
       if(set.contains(10)){
    System.out.println(" Found");
       }else{
        System.out.println("Not  found");
       }

//Iterator are used to iterate in hashing......
Iterator it=set.iterator();
while(it.hasNext()){
    System.out.println(it.next());
}


    }
}
