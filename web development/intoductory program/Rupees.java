import java.util.Scanner;


class Rupees {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the amount in paisa");
       double paise = in.nextDouble();
       double rupees = paise / 100;
       System.out.println("Amount in rupees is " + rupees);
   }
}