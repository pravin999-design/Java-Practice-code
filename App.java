public class App extends firstproject{
        
    
    public int pri(int p){
          System.out.println("Hello, Pravin !");
      
          //using switch 
          switch (p) {
            case 1 :
                  System.out.println("this is the Monday ");
                  

                  //the break statement are use for breaking the iterations of loop
                  break;

                  // The continue keyword are to Skip the current iteration in the loop

            case 2 :
                  System.out.println("this is the Tuesday ");
                  
                  break;

            case 3 :
                  System.out.println("this is the Wednsday ");
                  
                  break;

            case 4 :
                  System.out.println("this is the Thursday ");
                  
                  break;
            case 5 :
                  System.out.println("this is the Friday ");
                  
                  break;
            
            case 6 :
                  System.out.println("this is the Saturday ");
                  
                  break;
            case 7 :
                  System.out.println("this is the Sunday ");
                  
                  break;
            
                  
            
            default:
                  System.out.println("This is the Invalid day number ");
                  break;
          
          }
          
            //Do-while loop
            int h = 0;
            do{
                  System.out.println("This is the do loop");
                  h++;
            }while (h<=2);
            
                  
            //For loop

            for(h=1;h<2;h++){
                  System.out.println("This is the For loop");
            }
            
            //For each loop
            String [] names = new String[]{
                  "pramod" , "prasad" , "aditya" , "pravin" , "pratik"
            };

            for (String nam : names){
                  System.err.println("this is the value in names array of string = "+nam);
            }
            

            //math function class 
            Math.sqrt(h);
            Math.min(p, h);
            Math.max(p, h);


            
            
          return 0 ;


    }
    
      
       
        
    }

