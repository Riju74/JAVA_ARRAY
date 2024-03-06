import java.util.Scanner;

public class deleteAnElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 5, 9, 6, 3, 7};
        int[]b=new int[arr.length-1];
        int i=0;
//        print array
        while(i<arr.length){
            System.out.print(arr[i]+" ");
            i++;
        }
        System.out.println();
        //delete by index
//        System.out.print("Enter the value : ");
//        int valu=input.nextInt();
//        for(i=0;i<arr.length;i++){
//            if(arr[i]==valu){
//                continue;
//            }
//            else{
//                b[i-1]=arr[i];
//            }
//        }
//        System.out.print("elements are: ");
//        for(i=0;i<arr.length-1;i++){
//            System.out.print(b[i]+" 0");
//        }
        //delete by value
        System.out.print("Enter the value to delete: ");
        int value = input.nextInt();

        // Find the index of the value
        int index = -1;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Value not found in the array.");
            return;
        }

        // Delete the value by shifting elements
        for (i = 0; i < arr.length - 1; i++) {
            if (i < index) {
                b[i] = arr[i];
            } else {
                b[i] = arr[i + 1];
            }
        }

        System.out.print("Elements after deletion: ");
        for (i = 0; i < arr.length - 1; i++) {
            System.out.print(b[i] + " ");
        }
  }
}
