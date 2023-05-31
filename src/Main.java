import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] names = {"John", "Max", "Bill"};
        String myname;
        String name="myname";
        System.out.println(/*Arrays.toString(*/names[names.length-1]/*)*/);
        //System.out.println("Hello world!");
        System.out.println("myname = " + name.substring(1,name.length()-1));
        int[] arrSource = {1, 2, 3, 4, 5};
        int[] arrTarget = Arrays.copyOf(arrSource, arrSource.length);
        arrSource[0] = 100;
        System.out.println(arrTarget[0]); // отримаємо 1
    }
}