//Questions on code with harry video 29

public class Practice {
    public static void main(String[] args) {
        // for(int i=4;i>0;i--){
        //     for(int j=0;j<i;j++){
        //     System.out.println("*");
        //     }System.out.println("\n");


//question 2............
        float arr[]={10.5f,11.5f,12.5f,13.5f,20.5f};
float sum=0;
for(float element:arr){
    sum=sum+element;
}

System.out.println("Sum of array flaoats is:"+sum);

//Question 3...............
float target=10.55f;
boolean isInArray=false;

for(float element: arr){
    if(target==element){
        isInArray=true;
        break;
    }}
    if(isInArray){
    System.out.println("found");
    }else{
        System.out.println("not found");
    
}

//Question 4.................
int marks[]={92,68,67,75,64};
int sumofmarks=0;
for(int element:marks){
    sumofmarks=sumofmarks+element;
}

System.out.println("Avearge of student is:"+sumofmarks/5);



    }

    }

