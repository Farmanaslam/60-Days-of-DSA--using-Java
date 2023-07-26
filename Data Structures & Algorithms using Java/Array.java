import java.util.*;
public class Array{
public static void printarr(int arr[],int n){
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
}

    public static  int totalSum(int arr[],int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int average(int arr[],int n){
        int avg=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        avg=sum/n;
        return avg;
    }
    public static boolean contains(int arr[],int n,int key){
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                return true;
            }
            
        }
        return false;
    }

    public static int remove(int arr[],int n,int rmv){
        for(int i=0;i<n;i++){
            if(arr[i]==rmv){
                arr[i]=arr[i+1];
            }       }
            return rmv;
    }
// public static   void insert(int arr[],int n,int val,int index){
//     for(int j=arr.length-1;j>=index;j--){
//         arr[j+1]=arr[j];
//     }
//     arr[index]=val;
// }
public static int max(int arr[],int n){
int max=0;
for(int i=0;i<n;i++){
    if(arr[i]>max){
        max=arr[i];
    }
}
       return max;
}
public static int min(int arr[],int n){
    int min=0;
    for(int i=0;i<n;i++){
        if(arr[i]<min){
            min=arr[i];
        }
    }
           return min;
    }
    public static  int duplicate(int arr[]){
        int ans=0;
        for(int i=0;i<arr.length-1;i++){
         for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j] && i!=j){
                ans=ans+1;
            }
         }}
        return ans;
    }
    public static void commonValues(int arr[],int n,int arr2[],int m){
    
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(arr[i]==arr2[j]){
                System.out.print(arr[i]+" ");

            }
        }
    }
    }
    public static void main(String[] args) {
    System.out.println("I am Farman");

    int arr[]={10,20,30,4,3,7,1};
int n=arr.length;
int ans=totalSum(arr, n);
System.out.println(ans);

int average=average(arr, n);
System.out.println(average);

if(contains(arr, n, 10)){
    System.out.println("Found");
}else{
    System.out.println("Not found");
}

int removed=remove(arr,n, 10);
System.out.println("remove element is:"+removed);
printarr(arr,n);

// insert(arr, n, 0, 2);
// printarr(arr,n);
System.out.println();

int max=max(arr, n);
int min=min(arr, n);
System.out.println("MAXIMUM IS:"+max+"   "+"MINIMUM IS: "+min);

int arr2[]={1,2,3,2};
int a=duplicate(arr2);
System.out.println(a);
System.out.println(" ");

commonValues(arr, n, arr2, arr2.length);


}

}
