//this is the variable arguments

public class variablearguments {
    
        static void print (int ...value){
            for(int element : value){
                System.out.println("those are the value inside using  varibale argument "+ element);
            }
        }
        
        public static void main(String [] args){
                print(42);
                print(15,456);

            }




}
