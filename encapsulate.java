 //this is the encapsulation where we make private varibles
 // and use when we need outwise it will be safe using private
 
 
 class Main {
     
      private String name ;
      private int age;

      public void setname( String name){
      
            this.name = name ;
      }

      public void setage (int age){
            this.age = age ;
      }

      public String getname(){
            return name ;

      }
      
      public int getage (){
            return age ;
      }
}


public class encapsulate{

       public static void main(String[] args) {
            Main m = new Main();
            m.setage(11);
            m.setname("Pravin");

            System.out.println(m.getage());
            System.out.println(m.getname());
      }

}
