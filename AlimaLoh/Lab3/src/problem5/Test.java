package problem5;

import java.util.Arrays;
import Practice2.Time;
import problem4.Employee;
import problem4.Manager;

public class Test {

    public static void main(String[] args) {
        Comparable[] array = {
            new Chocolate(100, "Twix"),
            new Chocolate(200, "Merci"),
            new Chocolate(90, "Kazakhstan"),
            new Time(15, 41, 13),
            new Time(10, 04, 28),
            new Time(15, 41, 31)
        };

        System.out.println("Before Merge Sort:");
        for (Comparable item : array) {
            System.out.println(item);
        }

        Sort.mergeSort(array);

        System.out.println("After Merge Sort:");
        for (Comparable item : array) {
            System.out.println(item);
        }
    }
}
