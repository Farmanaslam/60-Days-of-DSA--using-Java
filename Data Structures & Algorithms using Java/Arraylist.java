import java.util.ArrayList;
import java.util.Collections;
class Arraylist{
    public static void main(String[] args) {

        //arraylist syntax......
        ArrayList<Integer> list=new ArrayList<>();

//arraylist add method....
        list.add(10);
list.add(20);
list.add(5);
System.out.println(list);
int data=list.get(1);
System.out.println(data);
list.add(0,15);
System.out.println(list);
//arraylist set method........
list.set(0,0);
System.out.println(list);

list.remove(1);
Collections.sort(list);
System.out.println(list);

    }
}