import java.util.Scanner;

class PerimeterAndArea {
           public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the side of square");
       double side = sc.nextDouble();
       double perimeter = 4 * side;
       double area = side * side;
       System.out.println("Perimeter of square is " + perimeter);
       System.out.println("Area of square is " + area);
   }
}