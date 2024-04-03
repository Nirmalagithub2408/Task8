import java.util.Scanner;

public class Seniorcitizen {
    static int int_Age;
    public static void getUserage() {
    System.out.println(" Please enter your age : ");
    Scanner sc = new Scanner (System.in);
    int_Age= sc.nextInt();
    }
    public static void getinfo(int Age) {
        if (Age>=60) {
            System.out.println("You are Senior citizen");
            
        } else {
            System.out.println("You are not a senior citizen");
            
        }

    }public static void main(String[] args) {
        getUserage();
        getinfo(int_Age);
    }
}