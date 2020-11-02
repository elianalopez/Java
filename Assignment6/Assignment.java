public class Assignment{

     public static void main(String []args){
            char [] a = {'c','a','t'};
            char [] b = {'d','o','g'};
            System.out.println(a); //print cat
            System.out.println(b); //print dog
            a=b;
            System.out.println(a);//print dog
            b[1] = 'u';
            System.out.println(b);//print dug
     }

}
