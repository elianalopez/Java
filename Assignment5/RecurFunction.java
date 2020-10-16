//recursive function example of numbers going up and down the steps of 10 by evens 
public class RecurFunction { 
    static void recur(int evens) { 
        if (evens < 1) 
            return; 
        else { 
            System.out.printf("%d ", evens); 
            recur(evens - 2); 
            System.out.printf("%d ", evens); 
            return; 
        } 
    } 
  
    public static void main(String[] args) { 
        int evens = 10; 
        recur(evens);         //Output: 10 8 6 4 2 2 4 6 8 10 
    } 
}
