public class BinarySearch {

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (high + low) / 2;
            if (key > list[mid]) {
                low = mid + 1;
            } else if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                    return mid;
            }
        }
        return -1;
    }
}

