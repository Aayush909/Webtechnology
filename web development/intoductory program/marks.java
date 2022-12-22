class marks {
    public static void main(String[] args) {
        int n=5, avg=0;
        int a[]=new int[n];
        a[0]=10;
        a[1]=15;
        a[2]=20;
        a[3]=25;
        a[4]=30;
        for(int i=0; i<n;i++) {
            avg=avg+a[i];
        }
        System.out.println("average of("+a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]+")is="+avg/n);
    }
}