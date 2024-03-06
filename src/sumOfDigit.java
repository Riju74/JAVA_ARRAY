import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        logic();

    }
    public static void logic(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=input.nextInt();
        int sum=0,r;
        while(num>0){
            r=num%10;
            sum=sum+r;
            num=num/10;
        }
        System.out.println("sum of the digits: "+sum);
    }
}
