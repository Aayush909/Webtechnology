import java.util.Scanner;

class powerofthenumber{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter number");
        int a = sc.nextInt();
        System.out.println("Enter number");
        int b = sc.nextInt();
        int p = 1;
        while (b!=0) {
            p = p * a;
            b= b-1;
        }
        System.out.println(p);
    }
}