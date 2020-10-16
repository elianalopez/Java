// Java program to demonstrate working of split
public class GFG { 
    public static void main(String args[]) 
    { 
        String str = "Lopez,Eliana"; 
        String[] arrOfStr = str.split(",", 2); 
  
        for (String a : arrOfStr) 
            System.out.println(a); 
    } 
}