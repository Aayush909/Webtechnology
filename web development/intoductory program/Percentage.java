import java.util.Scanner;

class Percentage {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the selling price");
       double sellingPrice = sc.nextDouble();
       System.out.println("Enter the cost price");
       double costPrice = sc.nextDouble();
       double profit = (sellingPrice - costPrice) / costPrice * 100;
       System.out.println("Profit or loss percentage is " + profit);
  }
}