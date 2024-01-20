package src.binarySearchProblems;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {-19, -18, -11, -8, -1, 0, 1, 3, 5, 11, 45, 90, 101};
        int target = 12;
        System.out.println(arr[ceilingOfNumber(arr, target)]);
        System.out.println(arr[floorOfNumber(arr, target)]);
    }
    private static int floorOfNumber(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;

        while(i <= j) {
            int mid = i + (j - i) / 2;

            if(arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] < target) {
                i = mid + 1;
            }
            else {
                j = mid - 1;
            }
        }
        return j;
    }
    private static int ceilingOfNumber(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;

        while(i <= j) {
            int mid = i + (j - i) / 2;

            if(arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] < target) {
                i = mid + 1;
            }
            else {
                j = mid - 1;
            }
        }
        return i;
    }
}
