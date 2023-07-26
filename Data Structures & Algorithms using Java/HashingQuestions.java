import java.util.*;
public class HashingQuestions {
public static void majorityElements(int arr[],int size){
    //Question 1........
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<size;i++){
        if(map.containsKey(arr[i])){
            //if true
            map.put(arr[i], map.get(arr[i])+1);
        }else{
            map.put(arr[i],1);
        }
    }
    for(int key:map.keySet()){
        if(map.get(key)>size/3){
            System.out.println(key);
        }
    }
    
}
//Question--2 Union of twp arrays
public static int unionSize(int arr1[],int arr2[]){
    HashSet<Integer> set=new HashSet<>();
     for(int i=0;i<arr1.length;i++){
        set.add(arr1[i]);
     }
     for(int j=0;j<arr2.length;j++){
        set.add(arr2[j]);
     }
     return set.size();
}
//Question 3--Intersection of two arrays
public static int intersectionSize(int arr3[],int arr4[]){
    HashSet<Integer> set=new HashSet<>();
    int count=0;
    for(int i=0;i<arr3.length;i++){
        set.add(arr3[i]);
    }
    for(int j=0;j<arr4.length;j++){
if(set.contains(arr4[j])){
count++;
set.remove(arr4[j]);
}
    }
    return count;
}
public static String getStart(HashMap<String,String> map){
    HashMap<String,String> revMap=new HashMap<>();//Reverse hashmap to find start
    for(String key:map.keySet()){
        revMap.put(map.get(key),key);
    }
    for(String key:map.keySet()){
        if(!revMap.containsKey(key)){
            return key;
        }
    }
    return null;
}


    public static void main(String[] args) {
        //Question 1--Given Integer array of size n, Find all elements that appear  more than n/3 times
int arr[]={1,3,2,5,1,3,1,5,1,2,2,2};
//Solution by hashhmap
int size=arr.length;
// HashMap<Integer,Integer> map=new HashMap<>();
// // System.out.println(size);
// // for(int i=0;i<size;i++){
// //     if(map.containsKey(arr[i])){
// // map.put(arr[i], map.get(arr[i])+1);
// //     }else {
// //         map.put(arr[i], 1);
// //     }
// // }
// // for(int key: map.keySet()){
// //     if(map.get(key)>size/3){
// // System.out.println("Majority Element is: "+key);
// //     }
// // }
System.out.println();

majorityElements(arr, size);

//Question--2 Calculate total elements in a union of two arrays arr1&arr2
int arr1[]={7,3,9};
int arr2[]={6,3,9,2,9,4};
int answer=unionSize(arr1,arr2);
System.out.println("Number of Elements in Union Array is:"+answer);

//Question 3--Print all Common elements from arr1 and arr2 by Intersection of two arrays
int arr3[]={7,3,9};
int arr4[]={6,3,9,2,9,4};
int ans=intersectionSize(arr3,arr4);
System.out.println(ans);



//Question 4.--Find Itenary from tickets means path from start to end with following hashmap
HashMap<String,String> map=new HashMap<>();
map.put("Chennai","Bengaluru");
map.put("Mumbai","Delhi");
map.put("Goa","Chennai");
map.put("Delhi","Goa");

//Find Route with following tickets map
String start=getStart(map);
while(map.containsKey(start)){
System.out.print(start+"->");
start=map.get(start);
}
System.out.println(start);

    }
}
