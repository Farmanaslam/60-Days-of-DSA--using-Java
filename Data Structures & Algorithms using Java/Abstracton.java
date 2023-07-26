//abstract keyword will hide all data
abstract class Janwar{
     abstract void walk();
}
class Cow  extends Janwar{

public void info(){
    System.out.println("4 legs");
}

@Override
void walk() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'walk'");
}
    

}


public class Abstracton {
    public static void main(String[] args) {
        
        Cow c=new Cow();
        
        c.info();
        
    }
}
