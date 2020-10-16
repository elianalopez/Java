//for this program we will show how Java methods can carry more than one data types in the parameter list
public class Addition
{
   public static void addition(String[] args)
   {
	System.out.println("We are going to add an int and a double!”);
      double z= add(10,1.1);
      System.out.println("Sum : " + z);
   }
   public static double add(int x, double y)
   {
      return (x+y);
   }
}
