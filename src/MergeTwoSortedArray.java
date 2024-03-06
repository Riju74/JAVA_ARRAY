public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] merge = new int[arr.length + arr2.length];
        int i, j,temp;
        //print first array
        System.out.print("first array: ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        //print second array
        System.out.println();
        System.out.print("second array: ");
        for(i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }

        // Merge the first array
        for (i = 0; i < arr.length; i++) {
            merge[i] = arr[i];
        }

        // Merge the second array
        for (j = 0; j < arr2.length; j++) {
            merge[i++] = arr2[j];

        }

        // Print the merged array
        System.out.println();
        System.out.print("Marge two array: ");
        for (i = 0; i < merge.length; i++) {
            System.out.print(merge[i] + " ");
        }
        // Sorting the merged array
        for (i = 0; i < merge.length - 1; i++) {
            for (j = i + 1; j < merge.length; j++) {
                if (merge[j] < merge[i]) {
                    temp = merge[i];
                    merge[i] = merge[j];
                    merge[j] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println();
        System.out.print("Sorted merged array: ");
        for (i = 0; i < merge.length; i++) {
            System.out.print(merge[i] + " ");
        }
    }
}
