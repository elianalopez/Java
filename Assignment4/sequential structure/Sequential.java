public class Sequential {
    public static void main(String[] args) {
//notice how every line of code is read from top to bottom without 
// any interruptions nor breaks 

    Scanner myObj = new Scanner(System.in);  //Creates a Scanner object
    System.out.println("Enter your name");

    String name = myObj.nextLine();  // Read name input
System.out.println("hello world my name " + name);  
// Output string + name input
  }
