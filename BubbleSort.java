package TA_Lab4;

public class BubbleSort implements Sorter {
    @Override
    public long sort(int[] a) {
        long stop;
        long start = System.nanoTime();
        int temp;
        int N = a.length;
        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j < N-1-i; j++) {
                if (a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        stop = System.nanoTime();
        return (stop - start) / 1000000;
    }
}
