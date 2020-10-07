class Return 
{ 
    public static void main(String args[]) 
    { 
        boolean gone = true; 
        System.out.println("You will see this!"); 
        if (gone) 
            return; 
        // The Java complier will skip every statement now
        System.out.println("You won’t see this! Secret."); 
	} 
} 
