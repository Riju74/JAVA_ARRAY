import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        logic();

    }
    public static void logic(){
        Scanner input =new Scanner(System.in);
        int i=1;
        System.out.print("Enter the number: ");
        int num=input.nextInt();
        int multi=1;
        while(i<=num){
            multi=multi*i;
            i++;
        }
        System.out.print("Factorial of "+num+" is ="+multi);
    }
}
