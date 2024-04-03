import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {

        int number;
        System.out.println(" Enter number : ");
        Scanner sc = new Scanner (System.in);
        number = sc.nextInt();        

  //checking whether the number is even or odd
  if (number% 2 == 0)
           System.out.println(number + " is Even");
  else
           System.out.println(number + " is odd");
   }
    
}
