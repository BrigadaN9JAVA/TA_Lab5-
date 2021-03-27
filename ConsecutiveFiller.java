package TA_Lab5;

public class ConsecutiveFiller implements Filler {
    @Override
    public void fill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
    }
}
