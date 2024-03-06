import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter searching item: ");
        int num = input.nextInt();
        int[] arr = {1, 2, 3, 58, 6, 8, 9, 7};
        int i = 0;
//        System.out.println(arr.length);
        while (i < arr.length) {
            if (num == arr[i]) {
                System.out.println("yes "+num +" is present at index= "+i);
                break;
            }
            i++;

        }
    }
}
