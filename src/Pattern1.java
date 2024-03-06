

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the numbers of rows: ");
        int num=input.nextInt();
        logic(num);
        logic2(num);
        logic3(num);

    }
    public static void logic(int num){
        System.out.println("Print right half pyramid------- ");
        int i=1;
        while(i<=num){
            int j=1;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
    }

    public static void logic2(int num){
        System.out.println("Print reverse left half pyramid------- ");
        int i=num;
        int j;
        while(i>=1){
            j=1;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;

        }
    }
    public static void logic3(int num){
        System.out.println("Print left half pyramid------- ");
        int c=num;
        while(c>0){
            int j=0;
            while(j<c-1){
                System.out.print("  ");
                j++;
            }
            int i=0;
            while(i<=(num-c)){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            c--;
        }


        }


}
