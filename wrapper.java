//wrapper class 
//convert primitive integer into wrapper class 
public class wrapper {
    public static void main(String[] args) {
        int a = 10 ;
        
        Integer obj = Integer.valueOf(a);
        
      //  int b = obj.intValue();

        System.out.println("THe value of a is :" + a );
        System.out.println("Wrapper class :"+ obj);
   
    }
}
