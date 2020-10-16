
import java.util.Scanner;
public class Multiplication
{
   public static void main(String[] args)
   {
      int num1, num2, mul;
      Scanner sc = new Scanner(System.in);
      System.out.println("First number : ");
      num1 = sc.nextInt();
      System.out.println("Second number : ");
      num2 = sc.nextInt();
      mul = multi(num1, num2);
      System.out.println("total " + mul);
      sc.close();
   }
   public static int multi(int a, int b)
   {
      int mul = a * b;
      return mul;
   }
}
