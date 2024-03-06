public class sumAndAverageArrayElemets {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,9};
        int sum=0;
        int i=1;
        float avg;

        while(i<arr.length){
            sum=sum+arr[i];
            i++;
        }
        System.out.println("Sum of the all elements in an array: "+sum);
        avg=(sum/arr.length);
        System.out.println("Average of all elements in an array: "+avg);
    }
}
