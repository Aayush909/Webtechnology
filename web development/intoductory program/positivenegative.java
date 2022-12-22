import java.util.Scanner;

class positivenegative {
    public static void main (String []args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter numbers of inputs =");
        int userchoise = input.nextInt();
        System.out.println();
        
        int i=0;
        int[] array =new int[userchoise];
        
        while(i<userchoise)
        {
              array[i] = input.nextInt();
              i++;
        }
        int positivecount = 0;
         int negativecount = 0;
          int zerocount = 0;
          
          for(int j=0;j<array.length;j++)
          {
              if(array[j] == 0)
              {
                  zerocount++;
              }
              
               if(array[j] > 0)
              {
                  zerocount++;
              }
              
              if(array[j] > 0)
              {
                  positivecount++;
              }
              
                  if(array[j] < 0)
              {
                  negativecount++;
              }
              
              }
              
              System.out.println("positivecount = "+positivecount);
              System.out.println("negativecount = "+negativecount);
              System.out.println("zerocount = "+zerocount);
          }
    }