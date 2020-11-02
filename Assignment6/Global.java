public class Global {
  public static String a = "You can access this here";
  public static String b = "You can access this there";
  public static String c = "Even here!";
  
  public static void main(String[] args) {
  String newA = Global.a;
  String newB = Global.b;
  System.out.println(newA);
  System.out.println(newB);
  int i = 0;
  while (i < 1) {
    System.out.println(c);
    i++;
  }
  
}
}
