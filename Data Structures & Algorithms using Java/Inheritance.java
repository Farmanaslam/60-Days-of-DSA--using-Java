//Inheritance are of 4 types

//Single Inheritance
    class Animal{
String color;
void info(){
    System.out.println("It is an Animal");
}
    }
class Horse extends Animal{
    void info(){
        System.out.println("4 legs");
    }
}


//Hierarchical Inheritance

class Animals{
    String color;
    int legs;
}
class Cow extends Animals{
    void eat(){
        System.out.println("Eats pLANT");
    }
}
class Buffalo extends Animals{
    void eat(){
        System.out.println("Eats same as cow");
    }
}


//Multilevel Inheritance
class Shape{
    int side;
    void area(){

    }
}
class Triangle extends Shape{
    void area(int l,int h){
        System.out.println("Area is"+(1/2)*l*h);
    }
}
class Equilateraltraingle extends Triangle{
    void area(int l,int h){
        System.out.println("Area is"+(1/2)*l*h);
    }
}


//Hybrid Inheritance means extending from any class 
class Circle extends Shape{
void area(int r){
    System.out.println("Area is:"+3.14*r*r);
}
}
class Dog extends Animals{
    void eat(){
        System.out.println("Eats only haddi");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        //Single Inheritance objects
        Horse h1= new Horse();
h1.color="brown";
System.out.println(h1.color);
h1.info();

//Hierarachical Inheritance objects
Cow c= new Cow();
c.color="White";
c.legs=4;
c.eat();
System.out.println(c.color + " "+c.legs);
    


    Buffalo b1= new Buffalo();
b1.color="black";
b1.legs=4;
b1.eat();
System.out.println(b1.color + " "+b1.legs);
    
//Multilevel Inheritance objects
Triangle t=new Triangle();
t.side=3;
System.out.println("Sides of Traingle are:"+t.side);
t.area(4,6);

Equilateraltraingle e=new Equilateraltraingle();
e.side=3;
System.out.println("sides are:"+e.side);
e.area(2,8);

Circle c1=new Circle();
c1.side=0;
System.out.println("No sides in circle");
c1.area(7);

Dog d= new Dog();
d.color="Black";
d.legs=4;
System.out.println("Dog color is "+d.color+" Legs are "+d.legs);
d.eat();






}}

