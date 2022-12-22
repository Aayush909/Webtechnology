import java.util.Scanner;

class Pen {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the quantity of pen");
       int pen = sc.nextInt();
       System.out.println("Enter the price of pen");
       int pricepen = sc.nextInt();
       System.out.println("Enter the quantity of copy");
       int copy = sc.nextInt();
       System.out.println("Enter the price of copy");
       int pricecopy = sc.nextInt();
       System.out.println("Enter the quantity of pencil");
       int pencil = sc.nextInt();
       System.out.println("Enter the price of pencil");
       int pricepencil = sc.nextInt();
       double totalAmount = pen * pricepen + copy * pricecopy + pencil * pricepencil;
       System.out.println("Total amount is " + totalAmount);
   }
}