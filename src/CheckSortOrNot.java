public class CheckSortOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 20, 3, 4, 5, 6, 7, 8, 98};
        if(!isSorted(arr)) {
            System.out.println("Not sorted");
        }
        else {
            System.out.println("Sorted");
        }
    }

    public static boolean isSorted(int[] arr) {
        int i = 1;
        while (i < arr.length) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
