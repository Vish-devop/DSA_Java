package src.assignments.sorting;

class MissingNumber {
    public int missingNumber(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            if(arr[i] < arr.length && arr[i] != arr[arr[i]]) {
                swap(arr, i, arr[i]);
            }
            else {
                i++;
            }
        }
        for(i = 0; i < arr.length; i++) {
            if(arr[i] != i) {
                return i;
            }
        }
        return arr.length;
    }

    private void swap(int[] arr, int start, int end) {
        int temp =  arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}