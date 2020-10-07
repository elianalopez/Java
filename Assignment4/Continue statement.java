//Using Continue statement to print numbers from 1 to 10

public class Continue{
    public static void main(String[] args) {
      
int i = 1;
while (i <=10) {
  if (i == 4) {
    i++;
    continue;
  }
  System.out.println(i);
  i++;
}
}
}