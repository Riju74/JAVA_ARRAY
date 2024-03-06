import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        logic();

    }

    public static void logic() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        int i = 1, count = 0;
        while (i <= num) {
            if (num%i== 0) {
                count++;
            }
            i++;
        }
        if(count==2){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
}
