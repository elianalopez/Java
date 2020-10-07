//Using Do - While Loop to find the sum of numbers from 1 to 10

public class DoWhileLoop { 
    public static void main(String args[]) 
    { 
        int x = 1, sum = 0; 
       
        
        do {
             
             sum = sum + x;
            x++; // Icrementing the value of x for the next interation
        }
  
        // Exit when x becomes greater than 10
        while (x <= 10);
        System.out.println("Sum of numbers from 1 to 10 is: " + sum);
        } 
    } 
