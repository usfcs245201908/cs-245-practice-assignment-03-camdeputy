public class BinaryRecursiveSearch implements Practice03Search {

    public int low = 0;
    public int high = 1;

    @Override
    public String searchName() {
        return new String("Binary Recursive Search");
    }

    @Override
    public int search(int[] arr, int target) {
       return search(arr, target, 0, arr.length - 1);
    }

    public int search(int[] arr, int target, int low, int high) {
        if(low >= high)
            return -1;
            int mid = (low + high)/2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target)
                return search(arr, target, mid + 1, high);
            else
                return search(arr, target, low, mid - 1);
    }
}
