import java.util.Scanner;

public class factorialofanynumber{
 public static void main (String[] args){
     Scanner console = new Scanner(System.in);
     int num; 
     int fact = 1;
     System.out.print("Enter any positive integer:");
     num= console.nextInt();
     for(int i=1; i<=num; i++)
     {
         fact *= i;
     }
     System.out.println("Factorial: "+ fact);
 }
}