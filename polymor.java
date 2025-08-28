
//this is the method overriding 

class polym{
    void hello(){
        System.out.println("THis is statement under hello function ");
    }
    
   
}

class polymo extends polym{
 
    int p ;
 void hello (){
   
        super.hello();
        System.out.println("This is statement under ");
        //this.p = p;
        System.out.println("THe value of p is - "+ p);
        
    }
}


public class polymor {
    public static void main(String[] args) {
        //polym p = new polym();
        polymo po = new polymo();
        // p.hello();
        po.hello();
    }
}
