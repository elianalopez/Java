class TwoSum { 
    static int[] total(int a, int b) 
    { 
        int[] sum = new int[2]; 
        sum[0] = a + b; //addition
        sum[1] = a - b; //subtraction
  
        return sum; //would return the elements from the array sum
    } 
  
    public static void main(String[] args) 
    { 
        int[] sum = total(200, 100); 
        System.out.println("Sum = " + sum[0]); 
        System.out.println("Sum = " + sum[1]); 
        //output will now be of two values
        //value one "Sum = 300"
        //value one "Sum = 100"
    } 
} 
