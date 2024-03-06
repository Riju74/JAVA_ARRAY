public class CheckPalindromeArrayOrNot {
    public static void main(String[] args) {
        int[] arr = {3, 3, 1, 1, 3, 4};
        int[] reversedArr = new int[arr.length];
        System.out.print("Array elements: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        System.out.print("Reverse elements: ");
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArr[j] = arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Reversed Array elements: ");
        for (int i = 0; i < reversedArr.length; i++) {
            System.out.print(reversedArr[i] + " ");
        }
        System.out.println();

        boolean isPalindrome = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != reversedArr[i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
    }
}
