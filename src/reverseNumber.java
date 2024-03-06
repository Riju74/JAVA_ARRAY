import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        logic();
    }
    public static void logic(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=input.nextInt();
        int r;
        while(num>0){
            r=num%10;
            System.out.print(r);
            num=num/10;
        }

    }
}
