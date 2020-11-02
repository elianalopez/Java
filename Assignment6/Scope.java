public class Scope
{
    public static void main(String args[]) 
    { 
        char w = 'd';
        {
            char x = 'a';
            char y = 'b';
            System.out.println(x);
            System.out.println(w);
        }  
        
        { 
            char z = 'c';
            System.out.println(z);
            System.out.println(w);
            //System.out.println(x); //would cause an error
            //"cannot find symbol" since x is not in the same scope
        }
        System.out.println(w);
    }
}
