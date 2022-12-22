import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class create {
    public static void main(String[] args) {
        List cars = new ArrayList();
        cars.add("Rolls Royce");
        cars.add("Range Rover");
        cars.add("TEsla");
        System.out.println("Unsorted List of cars:"+cars); 
        Collections.sort(cars);
        System.out.println("Sorted List of cars:"+cars); 
    }
}