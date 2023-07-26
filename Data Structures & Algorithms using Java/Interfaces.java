interface Jaanwars{
public    void walk();
}
class Cat implements Jaanwars{
public void walk(){
    System.out.println("Walks");
}
}

public class Interfaces {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.walk();
    }
}
