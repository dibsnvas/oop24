package problem5;

import Practice2.Time;

public class Test {

    public static void main(String[] args) {
        Chocolate[] chocolates = {
            new Chocolate(100, "Twix"),
            new Chocolate(200, "Merci"),
            new Chocolate(90, "Kazakhstan")
        };

        System.out.println("Before Merge Sort (Chocolates):");
        for (Chocolate ch : chocolates) {
            System.out.println(ch);
        }

        Sort.mergeSort(chocolates);

        System.out.println("After Merge Sort (Chocolates):");
        for (Chocolate ch : chocolates) {
            System.out.println(ch);
        }

        Time[] times = {
            new Time(15, 41, 13),
            new Time(10, 04, 28),
            new Time(15, 41, 31)
        };

        System.out.println("\nBefore Merge Sort (Times):");
        for (Time t : times) {
            System.out.println(t);
        }

        Sort.mergeSort(times);

        System.out.println("After Merge Sort (Times):");
        for (Time t : times) {
            System.out.println(t);
        }
    }
}
