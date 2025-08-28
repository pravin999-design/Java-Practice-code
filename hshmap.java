import java.util.*; 

/*In Java, a Map is a part of the Java Collection Framework used to store data in key-value pairs.
Think of it like a dictionary — where you look up a value using a unique key.
*/

public class hshmap {
    public static void main(String[] args) {
        
        HashMap <String , Integer> Studenet = new HashMap<>();

        Studenet.put("pravin", 545);
        Studenet.put("pramod", 44);
        Studenet.put("tonde", 5644);

        //it shows the this keys are contains inside 
    
        System.out.println("PRavin values"+ Studenet.get("pravin"));
        
        System.out.println("contains Amit "+Studenet.containsKey("pramod"));

        Studenet.remove("tonde");

        System.out.println("All student marks " + Studenet);
    }
    
}
