import static java.util.Collections.binarySearch;

public class Main {
    public static void main(String[] args) {

        BinarySearch binarySearch = new BinarySearch();

        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

        System.out.println(BinarySearch.binarySearch(list, 2));
        System.out.println(BinarySearch.binarySearch(list, 11));
        System.out.println(BinarySearch.binarySearch(list, 79));
        System.out.println(BinarySearch.binarySearch(list, 1));
        System.out.println(BinarySearch.binarySearch(list, 5));
        System.out.println(BinarySearch.binarySearch(list, 80));
    }
}
