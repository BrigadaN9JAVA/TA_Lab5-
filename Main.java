package TA_Lab4;

public class Main {
    public static void main(String[] args) {
        int[] arr1k = new int[1_000];
        int[] arr10k = new int[10_000];
        int[] arr100k = new int[100_000];
        DataProcessor randomBubble = new DataProcessor(new BubbleSort(), new RandomFiller());

        randomBubble.filling(arr1k);
        randomBubble.filling(arr10k);
        randomBubble.filling(arr100k);

        int[] arr1kB = arr1k.clone();
        int[] arr10kB = arr10k.clone();
        int[] arr100kB = arr100k.clone();

        int[] arr1kS = arr1k.clone();
        int[] arr10kS = arr10k.clone();
        int[] arr100kS = arr100k.clone();

        int[] arr1kI = arr1k.clone();
        int[] arr10kI = arr10k.clone();
        int[] arr100kI = arr100k.clone();

        System.out.println("Sorting random array:");
        System.out.println("Bubble - 1k -> " + randomBubble.sorting(arr1kB) + " ms");
        System.out.println("Bubble - 10k -> " + randomBubble.sorting(arr10kB) + " ms");
        System.out.println("Bubble - 100k -> " + randomBubble.sorting(arr100kB) + " ms");
        System.out.println("==================================");

        randomBubble.setSorter(new SelectionSort());
        System.out.println("Selection - 1k -> " + randomBubble.sorting(arr1kS) + " ms");
        System.out.println("Selection - 10k -> " + randomBubble.sorting(arr10kS) + " ms");
        System.out.println("Selection - 100k -> " + randomBubble.sorting(arr100kS) + " ms");
        System.out.println("==================================");

        randomBubble.setSorter(new InsertionSort());
        System.out.println("Insertion - 1k -> " + randomBubble.sorting(arr1kI) + " ms");
        System.out.println("Insertion - 10k -> " + randomBubble.sorting(arr10kI) + " ms");
        System.out.println("Insertion - 100k -> " + randomBubble.sorting(arr100kI) + " ms");
        System.out.println("==================================");
        System.out.println();

        randomBubble.setFiller(new СonsecutiveFiller());
        randomBubble.filling(arr1k);
        randomBubble.filling(arr10k);
        randomBubble.filling(arr100k);

        arr1kB = arr1k.clone();
        arr10kB = arr10k.clone();
        arr100kB = arr100k.clone();

        arr1kS = arr1k.clone();
        arr10kS = arr10k.clone();
        arr100kS = arr100k.clone();

        arr1kI = arr1k.clone();
        arr10kI = arr10k.clone();
        arr100kI = arr100k.clone();

        System.out.println("Sorting consecutive array:");
        randomBubble.setSorter(new BubbleSort());
        System.out.println("Bubble - 1k -> " + randomBubble.sorting(arr1kB) + " ms");
        System.out.println("Bubble - 10k -> " + randomBubble.sorting(arr10kB) + " ms");
        System.out.println("Bubble - 100k -> " + randomBubble.sorting(arr100kB) + " ms");
        System.out.println("==================================");

        randomBubble.setSorter(new SelectionSort());
        System.out.println("Selection - 1k -> " + randomBubble.sorting(arr1kS) + " ms");
        System.out.println("Selection - 10k -> " + randomBubble.sorting(arr10kS) + " ms");
        System.out.println("Selection - 100k -> " + randomBubble.sorting(arr100kS) + " ms");
        System.out.println("==================================");

        randomBubble.setSorter(new InsertionSort());
        System.out.println("Insertion - 1k -> " + randomBubble.sorting(arr1kI) + " ms");
        System.out.println("Insertion - 10k -> " + randomBubble.sorting(arr10kI) + " ms");
        System.out.println("Insertion - 100k -> " + randomBubble.sorting(arr100kI) + " ms");
    }
}
