
// this is the method overloading in polymorphism 

class polym{
    void hello(){
        System.out.println("THis is statement under hello function ");
    }
    
    int m ;
    void hello (int p){
        System.out.println("This is statement under argument hello function ");
        this.m = p;
        System.out.println("THe value of p is - "+ p);
    }
   
}

/* 
class polymo extends polym{ 
}
*/

public class polymor2 {
    public static void main(String[] args) {
        
        polym p = new polym();
        p.hello();
        p.hello(212);
    
    }
    
}
