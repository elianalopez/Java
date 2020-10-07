//Statement 1
public class DanglingElse {
  public static void main(String[] args) {
  int x=4;
  int y=12;

  if(x>5){
      if(y>10)
        System.out.println("First case");
      }
      else //else is indented with the inner if statement from line 8
        System.out.println("Second case");
      //because of the dangling else problem,Java would either print the first case or nothing at all
    }
}


//Statement 2
public class DanglingElse {
  public static void main(String[] args) {
  int x=4;
  int y=12;

  if(x>5){
      if(y>10)
        System.out.println("First case");
      }
  else //else is indented with the outer if statement from line 24
      System.out.println("Second case");
    //The Java virtual machine does not care about indentation
    }
}

//Solution
public class DanglingIf {
  public static void main(String[] args) {
  int x=4;
  int y=12;

  if(x>5){
      if(y>10)
      System.out.println("First case");
      }
  else
  System.out.println("Second case");
  //The Java can now execute both statements now if the conditions are right!
    }
}
