//Using Continue statement to print numbers from 1 to 10

public class Continue{
    public static void main(String[] args) {
      
int i = 1;
//Print numbers from 1<=i<=10
while (i <=10) {
  // Since i=4, it will skip 4 and print everything else
    if (i == 4) {
    i++;
    continue;
  }
  System.out.println(i);
  i++;
}
}
}
