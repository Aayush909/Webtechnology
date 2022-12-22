import java.util.Scanner;

class Day {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the day");
       int day = sc.nextInt();
       if (day == 6) {
           System.out.println("Day is Saturday");
       } else {
           System.out.println("Day is not Saturday");
       }
   }
}