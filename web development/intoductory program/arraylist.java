import java.util.*;
import java.io.*;
class arraylist {
    public static void main (String[] args) {
    List A = new ArrayList(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
    System.out.println("List is"+A);
    int N=99;
    int count=0;
    for(int i=0; i<A.size(); i++) {
        if ((int)A.get(i)==N){
            System.out.print("Found your value in List");
            break;
        }
        else{
            count++;
        }
    }
    if(count==A.size())
    System.out.println("the value is not in the list");
}
}