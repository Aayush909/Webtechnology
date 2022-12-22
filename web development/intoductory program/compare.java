import java.util.*;
class compare {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<String>();
        set1.add("Apple");
        set1.add("ball");
        set1.add("cup");
        System.out.println("Frist HashSet content:"+set1);
        HashSet<String>set2=new HashSet<String>();
        set2.add("apple");
        set2.add("cup");
        set2.add("Netherland");
        System.out.println("second HashSet content:"+set2);
        set1.retainAll(set2);
        System.out.println("HashSet content:");
        System.out.println(set1);
    }
}