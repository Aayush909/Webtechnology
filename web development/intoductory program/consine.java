class consine {
    public static void main (String []args) {
        double PI = 3.1415;
        double x, ret, val;
        
        x = 60.0;
        val = (int)PI / 180.0;
        ret = Math.cos(x * val); 
        System.out.print("The cosine of" + x + " is ");
        
        System.out.print(ret);
        System.out.println("degrees");
        
        x = 90.0;
        val = (int)PI / 180.0;
        ret = Math.cos(x * val);
        System.out.print("The cosine of" + x + " is ");
        
        System.out.print(ret);
        System.out.println("degrees");
    }
}