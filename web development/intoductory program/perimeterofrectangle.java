import java.util.Scanner;
public class perimeterofrectangle{
    public static void main(String[]arge){
        Scanner in=new Scanner(System.in);
        System.out.print("P,R,T:");
        double P=in.nextDouble();
        double R=in.nextDouble();
        double T=in.nextDouble();
        double SI= (P*R*T)/100;
        System.out.print(SI);
    }
}