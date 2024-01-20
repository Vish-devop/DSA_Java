package src.binarySearchProblems;

public class FindPositionElementSortedArrayInfiniteLength {
    /*
    * You have a sorted array of infinite numbers, how would you search an element in the array?
    * */
    // ######## AMAZON INTERVIEW QUESTION ##########
    // https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

    public static void main(String[] args)
    {
        int arr[] = new int[]{3, 5, 7, 9, 10, 90,
            100, 130, 140, 160, 170};
        int ans = findPosition(arr,10);

        if (ans==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + ans);
    }

    private static int findPosition(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while(end < Integer.MAX_VALUE && arr[end] < target) {
            start = end;
            end *= 2;
        }

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return mid;
            }

            if(arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
