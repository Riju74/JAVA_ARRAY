import java.util.Scanner;

public class sumOfallOdNumbers {
    public static void main(String[] args) {
        logics();

    }
    public static void logics(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of n: ");
        int num=input.nextInt();
        int i=1;
        int sum=0;
        while(i<=num){
            if(i%2!=0){
                sum=sum+i;
            }
            i++;
        }
        System.out.print("sum of the odd number is: "+sum);
    }
}
