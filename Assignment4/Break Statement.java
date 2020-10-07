//Using For Break statement to print numbers from 1 to 10

public class Break{
    public static void main(String[] args) {
      
    
        for (int i = 1; i <= 10; ++i) {

            // if the value of i is 8 the loop terminates  
            if (i == 8) {
                break;
            }      
            System.out.println(i);
        }   
    }
}