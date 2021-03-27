package TA_Lab5;

public class ShellSort implements Sorter {
    public long sort(int array[]) {
        long stop;
        long start = System.nanoTime();
        for (int step = array.length / 2; step > 0; step /= 2) {
            for (int i = step; i < array.length; i++) {
                for (int j = i; j >= step && array[j - step] > array[j] ; j -= step) {
                    int temp = array[j];
                    array[j] = array[j - step];
                    array[j - step] = temp;
                }
            }
        }
        stop = System.nanoTime();
        return (stop - start) / 1000000;
    }
}
