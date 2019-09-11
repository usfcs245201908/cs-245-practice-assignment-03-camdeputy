public class BinaryIterativeSearch implements Practice03Search {
    @Override
    public String searchName() {
        return new String("Binary Iterative Search");
    }

    @Override
    public int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1, mid = 0;
        while (low <= high) {
            mid = (low + high)/2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}

