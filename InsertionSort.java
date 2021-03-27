package TA_Lab4;

public class InsertionSort implements Sorter {
    @Override
    public long sort(int[] a) {
        long stop;
        long start = System.nanoTime();
        int temp;
        int indexToInsert;
        for (int index = 0; index < a.length; index++) {
            temp = a[index];
            indexToInsert = index;
            while (indexToInsert > 0 && a[indexToInsert - 1] >= temp) {
                a[indexToInsert] = a[indexToInsert - 1];
                indexToInsert--;
                a[indexToInsert] = temp;
            }
        }
        stop = System.nanoTime();
        return (stop - start) / 1000000;
    }
}
