import java.util.Scanner;
public class funcrion {
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
       int a= inputNumbers();
        System.out.print("Enter second number: ");
       int b= inputNumbers();
        System.out.print(sumTwoNumbers(a,b));
    }

    public static int sumTwoNumbers(int num1, int num2){
        return num1+num2;
    }
    public static int inputNumbers(){
        Scanner input=new Scanner(System.in);
//        System.out.print("Enter numbers: ");
        int a=input.nextInt();
        return a;

    }

}
