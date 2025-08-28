//Simple Calculator

import java.util.*;

public class calPROJECT  {
    public static void main(String[] args) {
        
       

        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter The number for calculation ");
        System.out.println("Enter The 1st number ");

        int x = sc.nextInt();

        System.out.println("Enter The 2st number ");

        int y = sc.nextInt();

        System.out.println( "Press 1 for Addition \n"+ "Press 2 for Substraction");
        System.out.println("Press 3 For Multiplication \n" + "Press 4 for division \n");
        int ab = sc.nextInt();
        
       // a obj = new a ();
       // obj.print();
       
        switch(ab){

                case 1 :
                int c = x + y;
                System.out.println("Addition is = \t"+ c);
                break;

                case 2 :
                int d = x-y;
                System.out.println("The Substraction is = \t " +  d);
                break ;

                case 3 :
                int e = x*y;
                System.out.println("The Multiplication  is = \t " +  e);
                break ;

                case 4 :
                int f = x/y;
                System.out.println("The Substraction is = \t " +  f);
                break ;

                default :
                System.out.println("Invalid Number , \t Please try again " );
                
            }


    }
}
