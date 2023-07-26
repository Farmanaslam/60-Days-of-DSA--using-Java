class Student{
String name;
int age;


//Method Printinfo
public void printInfo(){
System.out.println(this.name);
System.out.println(this.age);

}


//Non Parameterised Constructor
Student(){
    System.out.println("Student Added with following Info:-");
}

//parametrised Constructor
Student(String name, int age){
    this.name=name;
    this.age=age;

}

//Copy Constructor
Student(Student s1){
    this.name=s1.name;
    this.age=s1.age;

}



}
class Oops{
    public static void main(String[] args) {
        Student s1=new Student();// Constructor
        s1.name="Farman";
        s1.age=19;
s1.printInfo();
Student s2=new Student(); //constructor
s2.name="aman";
s2.age=18;
s2.printInfo();


Student s3=new Student("Ram",20);
s3.printInfo();


Student s4=new Student(s1);
s4.printInfo();

    }
}