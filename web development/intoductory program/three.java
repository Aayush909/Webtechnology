import java.util.*;

class three {
    public static void main (String[] args) {
        List fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("pear");
        fruits.add("cherry");
        List listA=new ArrayList();
        fruits.set(0,"Grapefruit");
        fruits.set(2,"Date");
        fruits.add("Orange");
        System.out.println("updated list is:"+fruits);
    }
}