public class trycatch {
    public static void main(String[] args) {
       
        try{

            int num = 60/0;
            System.out.println(num);

        }
        

        catch(ArrayIndexOutOfBoundsException e){

            System.out.println("Array index exception : " + e.getStackTrace());
        }

        catch(NumberFormatException e){

            System.out.println("Number format exception ");

        }
        
        catch(ArithmeticException e ){

            System.out.println("Multiple exceptions");

        }

        catch (Exception e)
        {
            System.out.println("There is the present error ");
        }
        
    }
}
