import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        logic();

    }

    public static void logic() {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=input.nextInt();
        System.out.print("Enter second number:");
        int num2=input.nextInt();
        int x,y,gcd,lcm;
        x=num1;
        y=num2;
        while(num1!=num2){
            if(num1>num2){
                num1=num1-num2;
            }
            else{
                num2=num2-num1;
            }
        }
        gcd=num1;
        System.out.println("GCD= "+gcd);
        lcm=(x*y)/gcd;
        System.out.print("LCM= "+lcm);

    }
}
