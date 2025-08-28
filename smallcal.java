// this is the multiplication 

import java.util.Scanner;

class cal{
     int p;
      int q;

    public void class1(int a , int b){
     
        this.p = a;
        this.q=b;

        int c = a*b ;

        System.out.println("\n The Answer is = \t"+ c);
                
    }
}
public class smallcal {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("\n Please Enter the 1st Value To Addition \n");
    int g = sc.nextInt();

    System.out.println(" \n Please Enter the 2nd Value for The addition \n");
    int j = sc.nextInt();

    cal c = new cal();
    c.class1(g,j);

    }
}
