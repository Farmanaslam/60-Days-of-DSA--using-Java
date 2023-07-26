
class Account{
    //using access modifiers
    public String name;
    protected String email;
    private String passward;

    //setters & getters
    public void setPassward(String pass){
this.passward=pass;
System.out.println("passward changed");
    }
    public String getPassward(){
return this.passward;
    }

//Account info method
public void acInfo(){
    System.out.println(this.name);
    System.out.println(this.email);
    
}


//Static keyword is used when the variable is common to all
static String branch;


}
class Accessmodifiers{
    public static void main(String[] args) {
        Account ac=new Account();
        Account.branch="ASANSOL BRANCH";
        ac.name="MD ASLAM";
        ac.email="farmanaslam674@gmail.com";
        
        ac.setPassward("farman121");
        String p=ac.getPassward();
        ac.acInfo();
        System.out.println("passward is "+p);
        System.out.println(ac.branch);
    }
}
