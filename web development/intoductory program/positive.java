import java.util.Scanner;

public class positive {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int a =in.nextInt();
        if (a>0) {
            System.out.println("positive");
        }else if (a < 0) {
             System.out.println("Negative");
            } else {
              System.out.println("Zero");  
        }
        
    }
}