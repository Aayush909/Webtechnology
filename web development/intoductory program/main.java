public class main {
    public static void main (String []args) {
        int[] numbers = {12, 4, 5, 2, 5};
        int sum = 0;
        Double average;
        for (int number: numbers) {
            sum += number;
        }
         int arrayLength = numbers.length;
         average = ((double)sum / (double)arrayLength);
         System.out.print("sum="+sum);
         System.out.print("average="+average);
         }
    }