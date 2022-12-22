class bicycle {
    int a;
    int b;
    void sum() {
      System.out.println(a+b);  
    }
    public static void main() {
        bicycle bi = new bicycle();
        bi.a=10;
        bi.b=20;
        bi.sum();
    }
}