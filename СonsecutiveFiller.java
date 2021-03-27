package TA_Lab4;

public class СonsecutiveFiller implements Filler{
    @Override
    public void fill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
    }
}
