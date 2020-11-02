public class InsideOutside{
   public static void main(String []args){
      int x = 7;
      var(x);
   }
   public static void var(int x){
      //comment out either line 9 or line 10, respected output is commented from the left of the lines of code
      //x = 11; //the output would be ll
      //int x = 11; //this will not work since variable x already defined
      System.out.println(x);
   }
}
