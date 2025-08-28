//import java.io.FileReader;
import java.io.FileWriter;

public class files {
    public static void main(String[] args) {
       
        try{
            //Here need to remember the file name need to copy from that file , not just seeing and paste it 
            FileWriter writer = new FileWriter("FiletoCheckCode/random.txt",true);
            writer.write("Hello..!, my Self Pravin katkade , I'm Very exited to Do Some Programs ");
            writer.close();
       
        }

        catch (Exception e) 
        {
            System.out.println("An error Occured ");
            e.getStackTrace();
        }
        
      
    }
}
