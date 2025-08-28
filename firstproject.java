import java.util.*;

    class bobo{
        String name ;
        int age ;

        bobo(String name , int age ){
            this.name = name ;
            this.age = age ;

        } 

        public String toString(){
            return "NAMe " + name + ", Age" + age;

        }
    }
    

public class firstproject {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        //stringbuilder class 
    
        StringBuilder str = new StringBuilder("This is the semtence");
        str.append("this word is appended to the stringbuilder object");
        System.out.println(str.toString());


        firstproject fc = new firstproject();
        App am = new App();
        am.pri(1);
        
        bobo bo = new bobo("pravin",21);
        System.out.println(bo);

        //calling loop wala funcation 
        fc.no();
        
        //calling 3 number comparison function
        fc.he();
         
        fc.hello();
        int [] arr = new int [10];
        int [] arg = {10,11,12,21,31,5544}; 
        System.out.println("an array value is \t"+ arg[5]);
        System.out.println("Enter the number of a For print the value of a");
        //input section 
        Scanner scanner = new Scanner(System.in);
        int a ;
        a = scanner.nextInt();
        
        System.out.println("This is the value of a \n"+ a);
        

        int x = 5;
        float y = (float)x;

        System.out.println("type casting \n"+y);

        //caling the loop wala function 
        
        //swapping the number into variables 
        int ab= 5;
        int ba = 10 ;
        System.out.println("This is the assignment operator = is the assignment operator  "+ ab );
        System.out.println("This is the assignment operator = is the assignment operator  "+ ba );
        
        ba = ab ;
        ab = ba ;
        
        
        System.out.println("this is the swapping value of ba is  \t" +ba);
        System.out.println("this is the swapping value of ba is  \t" +ab);

    }


    //just the simple method 

    public void hello(){ 
    int b = 20;
    System.out.println(b);
    System.out.println("Hello");

    System.out.println("\n");
    System.out.println("\n");
   
   
     /*  
    Show the following patterns using single print 
    statement */
    /**
 
 


    * Prints three star patterns with one println per pattern.
    */


        // 1️⃣ Right Half Pyramid
        System.out.println(
            "*\n" +
            "**\n" +
            "***\n" +
            "****\n" +
            "*****");

        System.out.println();          // blank line between patterns

        // 2️⃣ Reverse Right Half Pyramid
        System.out.println(
            "*****\n" +
            "****\n" +
            "***\n" +
            "**\n" +
            "*");

        System.out.println();          // another blank line

        // 3️⃣ Left Half Pyramid
        System.out.println(
            "    *\n" +   // 4 leading spaces
            "   **\n" +   // 3 leading spaces
            "  ***\n" +   // 2 leading spaces
            " ****\n" +   // 1 leading space
            "*****");     // no leading space
       
        
    
        }
         
        // assignment operator
        
        int p = 1 ;
        public int no(){

            if (p==10) {

                for(int i = 0;i<p;i++){
                System.out.println("This is the "+ i +"th /t number --" + i);
            }
                
            }
        
            else {
                System.out.println("default");
            }
            
            
            return 0;

        } 

        public int he(){
            int bx ;
            int cx ;
            int zx ;
            Scanner bb = new Scanner(System.in);

            System.out.println("Enter the 1st value ");
            bx = bb.nextInt() ;
            
            System.out.println("Enter the 2nd value  ");
            cx = bb.nextInt();
            
            System.out.println("Enter the 3rd value ");
            zx = bb .nextInt();

            if(bx>cx){
                if (bx>zx) {
                    System.out.println("The greateest number is \t" + bx );
                }

            }
            if(zx>cx){
                if (zx>bx) {
                    System.out.println("The greateest number is \t" + zx );
                }

            }
            if(cx>zx){
                if (cx>bx) {
                    System.out.println("The greateest number is \t" + cx );
                }

            }
            return 0 ;
        }



    }
    





   
 