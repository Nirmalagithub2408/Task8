import java.util.Scanner;

public class Alphabets {
   
	private static Scanner sc;

	public static void main(String[] args) {
			
		char ch, strChar;
		sc= new Scanner(System.in);A

		System.out.print("Please Enter any Character =  ");
		strChar = sc.next().charAt(0);
		
		for(ch = strChar; ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
		}
	}
    



    
}
