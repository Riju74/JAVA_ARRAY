public class maximumAndMinimumElements {
    public static void main(String[] args) {
        int[] arr={0,2,3,4,5,6,7,8,99};
        int i=0;
        int max=arr[0];
        int min=arr[0];
        while(i<arr.length){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
            i++;
        }
        System.out.println("Maximum number: "+max);
        System.out.println("Minimum number: "+min);


    }
}
