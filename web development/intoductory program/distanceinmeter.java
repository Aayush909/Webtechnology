import java.util.Scanner;
public class distanceinmeter{
    public static void main(String[]arge){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Length in M:");
        double a=in.nextDouble();
        double km = a/1000;
        System.out.print(km);
    }
}