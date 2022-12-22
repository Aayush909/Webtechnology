import java.util.Scanner;
public class pe{
    public static void main(String[]arge){
        Scanner in=new Scanner(System.in);
        System.out.print("M,H:");
        double G=9.8;
        double M=in.nextDouble();
        double H=in.nextDouble();
        double PE= M*G*H;
        System.out.print(PE);
    }
}