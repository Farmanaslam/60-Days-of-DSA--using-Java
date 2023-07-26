class Employee{
    String name;
    int id;
    void info(){
        System.out.println(this.name);
        System.out.println(this.id);
    }
    
}

public class Encapsulation {
public static void main(String[] args) {

    //Making data & objects in a single class is called Encapsulation
    Employee e=new Employee();
    e.name="aman";
    e.id=22;
e.info();
}    
}
