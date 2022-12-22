import java.util.Scanner;
public class kilometer{
    public static void main(String[]arge){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Length in KM:");
        double mi=0.62137119;
        double a=in.nextDouble();
        double Mi= a*mi;
        System.out.print(Mi);
    }
}