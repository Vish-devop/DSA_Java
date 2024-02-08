package src.assignments.sorting;

public class MergeSort {


    public static void main(String[] args) {
        int[] arr = new int[]{4,2,7,23,76,55};
        mergeSort(arr, 0, arr.length - 1);
    }
    private static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }
    private static void merge(int[] arr, int start, int mid, int end) {

    }
}
