public class jv {  
public static void main(String[]arge)
 {  
     int richter=5;
 if (richter >= 8.0) {  // Handle the ‘special case’ first
  System.out.println("Most structures fall");
} else if (richter >= 7.0) {
  System.out.println("Many buildings destroyed");
} else if (richter >= 6.0) {
  System.out.println("Many buildings damaged, some collapse");
} else if (richter >= 4.5) {
  System.out.println("Damage to poorly constructed buildings");
} else {   // so that the general case can be handled last
  System.out.println("No destruction of buildings");
}
    
}
}  
