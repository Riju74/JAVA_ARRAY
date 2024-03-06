import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr={1,23,4,679,976,46};
        for(int i=arr.length-1;i>0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
