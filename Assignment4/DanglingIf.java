public class DanglingIf {
  public static void main(String[] args) {

    int myNum = 5;        
    if ( myNum > 0 )   
      if ( myNum < 10 ) 
        System.out.println( "greater than 10" ) ;
      else
        System.out.println( "less than 10" ) ;
      //because of the dangling else problem, the output would always be "greater than 10"
      //regardless of the output
    }
}
