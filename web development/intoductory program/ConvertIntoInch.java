import java.util.Scanner;

class ConvertIntoInch {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value in meter");
       double meter = sc.nextDouble();
       double inch = meter * 39.37;
       System.out.println("Value in inch is " + inch);
   }
}