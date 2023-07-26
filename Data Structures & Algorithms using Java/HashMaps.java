import java.util.*;
import java.util.Map.Entry;
public class HashMaps {
    public static void main(String[] args) {
        //Hashmaps are used whene there is pair like student information
        HashMap<Integer,String> class1=new HashMap<>();

        //Add in hasmap
        class1.put(1, "Md Farman Aslam");
        class1.put(2, "Raj");
        class1.put(3, "Rohan");
        class1.put(4, "Md Aman");
System.out.println(class1);

//Updating in hashmap.........
class1.put(1, "Md Farman Shekh");
System.out.println(class1);

//Searching in hashmap...........
if(class1.containsKey(4)){
    System.out.println("Present");
}else{
    System.out.println("Not present");
}

//Searching for name by giving roll...........
if(class1.containsValue("Md Aman")){
    System.out.println("Present");
}else{
    System.out.println("Not present");
}

//Searching directly.......
System.out.println(class1.get(1));


//Iterating in a HashMap...........
for(Entry<Integer, String> e:class1.entrySet()){
    System.out.println(e.getKey());
    System.out.println(e.getValue());
}


}
}