
public class BinarySearch {

    public static void main(String args[]) {
        BinarySearch obj = new BinarySearch();

        // The input array should be sorted
        int[] arr = {1, 2, 3, 4, 5, 6};

        int x = 8;

        System.out.println(obj.binarySearchRecursive(arr, 0, arr.length - 1, x));

        System.out.println(obj.binarySearchIterative(arr, 0, arr.length - 1, x));
    }

    public int binarySearchRecursive(int[] arr, int l, int r, int x) {

        if (l > r) {
            return -1;
        }

        int mid = (l + r) / 2;

        if (arr[mid] == x) {
            return mid;
        }

        if (x > arr[mid]) {
            return binarySearchRecursive(arr, mid + 1, r, x);
        }

        return binarySearchRecursive(arr, l, mid - 1, x);
    }

    public int binarySearchIterative(int[] arr, int l, int r, int x) {

        while (l <= r) {
            int mid = (l + r) / 2;
            if (x == arr[mid]) {
                return mid;
            } else if (x > arr[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return -1;
    }

}
