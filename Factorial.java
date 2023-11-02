import java.util.Scanner;

public class Factorial {

   public static void main(String[] args) {
    //    Scanner scanner = new Scanner(System.in);
    //    System.out.println("Enter a number: ");
    //    int num = scanner.nextInt();
       int num=5;
       System.out.println("Factorial of " + num + " is " + factorial121(num));
   }

   public static long factorial121(int num) {
       long factorial = 1;
       for (int i = 1; i <= num; i++) {
           factorial *= i;
       }
       return factorial;
   }
}