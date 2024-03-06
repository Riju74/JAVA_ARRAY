import java.util.Scanner;

public class numberOccurrences {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,4,4,5,5,66,66,66,3};
        int i=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the searching key: ");
        int key=input.nextInt();
        int count=0;
        while(i<arr.length){
            if(arr[i]==key){
                System.out.println(key+" is appeared at position "+(i+1)+" in an array.");
                count++;
            }
            i++;
        }
        System.out.println("final result: "+key+" has apperared "+count+" time");
        System.out.println();

    }

}
