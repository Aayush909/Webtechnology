import java.util.Scanner;

class VolumeOfCuboid {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the length of cuboid");
       double length = sc.nextDouble();
       System.out.println("Enter the breadth of cuboid");
       double breadth = sc.nextDouble();
       System.out.println("Enter the height of cuboid");
       double height = sc.nextDouble();
       double volume = length * breadth * height;
       System.out.println("Volume of cuboid is " + volume);
   }
}