
//this is the static inner nested class , where we use static varibales & classs , 
//we access using class name to inner class to make object.

class outer{
    static int a = 23;

    static class staticnested {
        void shows(){
            System.out.println("The value of a " + a);
        }
    }
}
public class innnernested {
    public static void main(String[] args) {
        outer.staticnested obj = new outer.staticnested();
        obj.shows();
    }
    
}
