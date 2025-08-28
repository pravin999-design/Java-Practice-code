abstract class hello{
    void print(){
        System.out.println("Its the void print funcation");
    }

    //declare abstract method in abstract class
    abstract void printer();
}


class shop extends hello {

    @Override
    void printer() {
     
        //throw new UnsupportedOperationException("Unimplemented method 'printer'");
        System.out.println("This is the abstract method defined using extends child class");
    }

}


public class ABSTARACT {
  public static void main(String[] args) {
    
    // we cannot define & use the abstract class object cause it shows error
    shop h = new shop() ;
    h.print();
    h.printer();
 
}  
}
