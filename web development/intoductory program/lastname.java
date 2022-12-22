import java.util.Scanner;

public class lastname {
    public static void main (String []args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter last name");
        
        String lastname = myObj.nextLine();
        System.out.println("User last name is" + lastname);
    }
}