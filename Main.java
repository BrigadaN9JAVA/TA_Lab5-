package TA_Lab5;

public class Main {
    public static void main(String[] args) {
        int[] arr100k = new int[100_000];
        int[] arr1m = new int[1_000_000];

        DataProcessor dp = new DataProcessor(new ShellSort(), new RandomFiller());

        dp.filling(arr100k);
        dp.filling(arr1m);

        int[] arr100kQ = arr100k.clone();
        int[] arr1mQ = arr1m.clone();

        int[] arr100kS = arr100k.clone();
        int[] arr1mS = arr1m.clone();

        int[] arr100kM = arr100k.clone();
        int[] arr1mM = arr1m.clone();

        int[] arr100kH = arr100k.clone();
        int[] arr1mH = arr1m.clone();

        System.out.println("Sorting random array:");
        System.out.println("Shell - 100k -> " + dp.sorting(arr100kS) + " ms");
        System.out.println("Shell - 1m -> " + dp.sorting(arr1mS) + " ms");
        System.out.println("==================================");

        dp.setSorter(new MergeSort());
        System.out.println("Merge - 100k -> " + dp.sorting(arr100kM) + " ms");
        System.out.println("Merge - 1m -> " + dp.sorting(arr1mM) + " ms");
        System.out.println("==================================");

        dp.setSorter(new HeapSort());
        System.out.println("Heap - 100k -> " + dp.sorting(arr100kH) + " ms");
        System.out.println("Heap - 1m -> " + dp.sorting(arr1mH) + " ms");
        System.out.println("==================================");

        dp.setSorter(new QuickSort());
        System.out.println("Quick - 100k -> " + dp.sorting(arr100kQ) + " ms");
        System.out.println("Quick - 1m -> " + dp.sorting(arr1mQ) + " ms");
        System.out.println("==================================");
        System.out.println();

        dp.setFiller(new ConsecutiveFiller());

        dp.filling(arr100k);
        dp.filling(arr1m);

        arr100kQ = arr100k.clone();
        arr1mQ = arr1m.clone();

        arr100kS = arr100k.clone();
        arr1mS = arr1mS.clone();

        arr100kM = arr100k.clone();
        arr1mM = arr1m.clone();

        arr100kH = arr100k.clone();
        arr1mH = arr1m.clone();

        System.out.println("Sorting consecutive array:");
        dp.setSorter(new ShellSort());
        System.out.println("Shell - 100k -> " + dp.sorting(arr100kS) + " ms");
        System.out.println("Shell - 1m -> " + dp.sorting(arr1mS) + " ms");
        System.out.println("==================================");

        dp.setSorter(new MergeSort());
        System.out.println("Merge - 100k -> " + dp.sorting(arr100kM) + " ms");
        System.out.println("Merge - 1m -> " + dp.sorting(arr1mM) + " ms");
        System.out.println("==================================");

        dp.setSorter(new HeapSort());
        System.out.println("Heap - 100k -> " + dp.sorting(arr100kH) + " ms");
        System.out.println("Heap - 1m -> " + dp.sorting(arr1mH) + " ms");
        System.out.println("==================================");

        dp.setSorter(new QuickSort());
        System.out.println("Quick - 100k -> " + dp.sorting(arr100kQ) + " ms");
        System.out.println("Quick - 1m -> " + dp.sorting(arr1mQ) + " ms");
    }
}
