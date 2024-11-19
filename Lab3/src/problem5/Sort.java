package problem5;

import java.util.Vector;

public class Sort {
    static <E> void swap(E[] array, int i, int j) {
        E temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static <E extends Comparable<E>> void mergeSort(E[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    static <E extends Comparable<E>> void mergeSort(E[] array, int l, int r) {
        if (l >= r) {
            return;
        }
        int m = (l + r) / 2;
        mergeSort(array, l, m);
        mergeSort(array, m + 1, r);

        Vector<E> temp = new Vector<>();
        int i = l, j = m + 1;
        while (i <= m || j <= r) {
            if (j > r || (i <= m && array[i].compareTo(array[j]) <= 0)) {
                temp.add(array[i++]);
            } else {
                temp.add(array[j++]);
            }
        }
        for (i = 0, j = l; i < temp.size(); i++, j++) {
            array[j] = temp.get(i);
        }
    }
}
