import java.util.Scanner;
public class kg{
    public static void main(String[]arge){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter amount in kg:");
        double KG=in.nextDouble();
        double G= KG*1000;
        System.out.print(G);
    }
}