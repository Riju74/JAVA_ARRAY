import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        logic();

    }
    public static void logic(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=input.nextInt();
        int r,arm=0,c;
        c=num;

        while(num>0){
            r=num%10;
            arm=(r*r*r)+arm;
            num=num/10;
        }
        if(c==arm){
            System.out.print("Armstrong");
        }
        else{
            System.out.print("Not a Armstrong number.");
        }

    }
}
