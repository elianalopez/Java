//Using For Loop to find the sum of numbers from 1 to 10

public class ForLoop{
public static void main(String[]args) {
    int num=10,count, total=0;
      
  for(count = 1; count <= num; count++){
           total = total + count;
       }
        System.out.println("Sum of numbers from 1 to 10 is: "+total);
    }
}
