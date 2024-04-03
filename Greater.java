import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
      int c = 93, d = 55, a = -10, b = -3, sum, s;  
      sum=Integer.sum(c, d);  
//returns the sum of c and d  
        System.out.println("The sum of c and d is: " +sum);    
        s=Integer.sum(a, b);  
        System.out.println("The sum of a and b is: " +s);  
        // If else statement
        if (s>sum) {
            System.out.println("Sum of a and b is greater than x and y");
            
        } else {
            System.out.println("Sum of a and b is lesser than x and y");
        }
        

    }
    
}
