import java.util.Scanner;
public class student {
    public static void main (String []args){
        Scanner in=new Scanner (System.in);
        System.out.print("eneter your credit points: ");
        int credit= in.nextInt();
        if (credit>=90){
            System.out.println("Senior");
            }else if (credit>=60){
            System.out.println("Junior");
            }else if  (credit>=30){
            System.out.println("Sophmore");
            }else{
            System.out.println("Freshman");
            }
    }
}