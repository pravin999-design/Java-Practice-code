   
interface remote{

//those both are same , no matter bcz all method by default abstract 
void print();
abstract void hello();

}
    
class remotewala implements remote{

    public void print(){
     
        System.out.println("\n This is the print method in remotewala class ");
    
    }

    public void hello(){
        System.out.println("\n This is the helloo wala funcation in remotewala class \n ");
    }
}


public class intrface {
    public static void main(String[] args) {
        
        //we cannot make interface object in java
        remotewala r = new remotewala();
        r.print();
        r.hello();
        
    }
    
}
