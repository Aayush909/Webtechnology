public class sphere1{
    public static void main(String[]arge)
    {
        int a= 6;
        int b= 5;
        int c= 7;
        int s= (a+b+c)/2;
        double vol=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(vol);
    }
}