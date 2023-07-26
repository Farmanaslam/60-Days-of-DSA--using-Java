class Students{
String name;
int age;


//Compile time polymorphism  creating same methods with different parameters
//Method Overloading
public void printInfo(String name){
    
    System.out.println(name);
}

public void printInfo(int age){
    
    System.out.println(age);
}
public void printInfo(String name,int age){
    
    System.out.println(name+" "+age);
}

}

//Runtime POLYMORPHISM//Method overiding

class Animal{
String color;
public void info(){

};
}
class Horse extends Animal{
    public void info(){
        System.out.println("4 legs");
    }
}


public class Polymor {
    public static void main(String[] args) {
Students s2= new Students();
s2.name="aman";
s2.age=20;
s2.printInfo(s2.age);
s2.printInfo(s2.name);
s2.printInfo(s2.name,s2.age);

     
Horse h=new Horse();
h.color="brown";
h.info();
System.out.println(h.color);


    }
}
