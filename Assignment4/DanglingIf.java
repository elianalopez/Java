//Statement 2
public class DanglingIf {
  public static void main(String[] args) {
    int myNum = 5;        
    if ( myNum > 0 )   
      if ( myNum < 10 ) 
        System.out.println( "greater than 10" ) ;
      else //else is indented with the inner if statement from line 6
        System.out.println( "less than 10" ) ;
      //because of the dangling else problem, the output would always be "greater than 10" regardless of the value of myNum as long as it is greater than 0
    }
}


//Statement 2
public class DanglingIf {
  public static void main(String[] args) {
    int myNum = 5;        
    if ( myNum > 0 )   
      if ( myNum < 10 ) 
        System.out.println( "greater than 10" ) ;
    else //else is indented with the outer if statement from line 20
      System.out.println( "less than 10" ) ;
      //because of the dangling else problem, the output would always be "greater than 10" regardless of the value of myNum as long as it is greater than 0
    }
}
