import java.util.*;
//mport java.io.*;

/*
in the list interface have multiple classes 
1. vector
2. queue
3. ArrayList
4. Linkedlist
5. Stack
*/

public class Listinterface {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>() ;
            li.add(44);
            li.add(45);
            System.out.println("Stored Interger Element's in the list = ");
            System.out.println(li);

            System.out.println("Remove The Elment in The list ");
            
            li.remove(1);
            System.out.println("We Remove the element in the index At 1");
            System.out.println(li);

        List <String> lis = new LinkedList<>();
            lis.add("First");
            lis.add("Second");

            System.out.println("The Elements under The Linked list interface = ");
            System.out.println(lis);

            System.out.println("Remove The Element At The Position of 0 ");
            lis.remove(0);
            System.out.println("Elements After Removing In the Linked List Interface");
            System.out.println(lis);

        Vector<Integer> v = new Vector<>();
            v.add(765);
            v.add(63);
            v.add(83);

            System.out.println("Elemts in the Vector = "+ v );


        Stack<Integer> s = new Stack<>();
            s.push(10);
            s.push(73);
            System.out.println("Pushed(Added) Elements in the Stack - ");
            System.out.println(s);

            //in the pop function we cannot remove particular elments it follows LIFO
            s.pop();
            System.out.println("Remove the Elments in he Stack ");
            System.out.println(s);

        
            // in the queue we use the different class name instead of the queue name Ex- new Queue()- (wrong), new Arraylist() -(Correct)
        Queue<String> q = new ArrayDeque<>();   
       
            q.add("73");
            System.out.println("Elemets in the Queue - "+ q);
            q.remove();
            System.out.println("After Remove the Elemts - "+ q);
    }

}
