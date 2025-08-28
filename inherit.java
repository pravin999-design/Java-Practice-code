
//single inheritance 
class a {
    
    protected int b = 10;
    
    public void parentclass(){

        System.out.println("This is the parent class ");
    }
}

class b extends a{

    void childclass(){
     System.out.println("The value of b is " + b);    
    }
}

class c extends b {

    void multilevel (){
        System.out.println("This is the multilevel inheritance ");
    }
}
public class inherit {
 public static void main(String[] args) {
    
    //b obj = new b();
    
    c obj = new c ();
    obj.childclass();
    obj.multilevel();
    obj.parentclass();
    

 }    
}
