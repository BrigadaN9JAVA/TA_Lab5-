package TA_Lab4;

public class RandomFiller implements Filler{
    @Override
    public void fill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20001) - 10000;
        }
    }
}
