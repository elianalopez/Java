//Using While Loop to find the sum of numbers from 1 to 10

public class WhileLoop { 
    public static void main(String args[]) 
    { 
        int x = 1, sum = 0; 
  
        // Exit when x becomes greater than 10
        while (x <= 10) { 
            sum = sum + x; // Total sum of x 
            x++; // Icrementing the value of x for the next interation
        } 
        System.out.println("Sum of numbers from 1 to 10 is: " + sum); 
    } 
}
