import java.util.Scanner;

public class countinteger {

    public static void main(String[] args) {
        int number;
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        int count = 0;
        
        for(; number != 0; number/=10, ++count) {
           
        }
        System.out.print(" Number of digits: " + count);

    }
    
}
