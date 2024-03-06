import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.print("Enter the number of rows: ");
//        int number=input.nextInt();
        pattern(input());

    }
    public static void pattern(int num) {
        int i = 0;
        while (i < num) {
            int j=0;
            while(j<=i) {
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }

    }
    public static int input(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int number=input.nextInt();
        return number;
    }
}
