package src.binarySearchProblems;

import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-19, -18, -11, -8, -1, 0, 1, 3, 5, 11, 45, 90, 101};
        int target = 11;
        System.out.println(binarySearchUsingRecursion(arr, target));
    }
    public static int binarySearch(List<Integer> arr, int target) {
        int i = 0;
        int j = arr.size() - 1;

        while(i <= j) {
            int mid = (i + ((j - i) / 2));

            if(arr.get(mid) == target) {
                return mid;
            }
            else if(arr.get(mid) < target) {
                i = mid + 1;
            }
            else {
                j = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;
        while(i <= j) {
            int mid = (i + (j - i)/ 2);

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
        return -1;
    }

    public static int binarySearchUsingRecursion(int[] arr, int target) {
        return binarySearchUsingRecursion(arr, target, 0, arr.length);
    }

    private static int binarySearchUsingRecursion(int[] arr, int target, int i, int j) {
        if(i > j) {
            return -1;
        }
        int mid = (i + (j - i) / 2);
        if(arr[mid] == target) {
            return mid;
        }

        if(arr[mid] < target) {
            return binarySearchUsingRecursion(arr, target, mid + 1, j);
        }
        return binarySearchUsingRecursion(arr, target, i, mid - 1);
    }

    public static int binarySearchUsingRecursion(List<Integer> arr, int target) {
        return binarySearchUsingRecursion(arr, target, 0, arr.size());
    }

    private static int binarySearchUsingRecursion(List<Integer> arr, int target, int i, int j) {
        if(i > j) {
            return -1;
        }

        int mid = (i + (j - i) / 2);
        if(arr.get(mid) == target) {
            return mid;
        }

        if(arr.get(mid) < target) {
            return binarySearchUsingRecursion(arr, target, mid + 1, j);
        }
        return binarySearchUsingRecursion(arr, target, i, mid - 1);
    }
}
