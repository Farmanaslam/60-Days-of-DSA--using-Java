import java.util.*;
import java.util.ArrayList;

public class ArrayQueston
 {

	public static int findDuplicate(ArrayList<Integer> arr) {
     HashSet<Integer> set=new HashSet<>();
	 int k=0;
	 for(int i=0;i<arr.size();i++){
		 set.add(arr.get(i));
		 arr.remove(i);
	 }
	 for(int i=0;i<arr.size();i++){
		 k= arr.get(i);
	 }
return k;
	}
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(4);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(1);

      int ans=  findDuplicate(arr);
      System.out.println(ans);
    }
}