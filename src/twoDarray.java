public class twoDarray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,5},{1,4,7,8}};
//        System.out.println(arr[0].length);
//        System.out.println(arr[0][2]);
        int i=0;
        while(i<arr.length){
            int j=0;
            while(j<arr[i].length){
                System.out.print(arr[i][j]+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
