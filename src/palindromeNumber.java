import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        logic();
    }
    public static void logic(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=input.nextInt();
        int r,c,s=0;
        c=num;
        while(num>0){
            r=num%10;
            s=r+(s*10);
            num=num/10;
        }
        if(c==s){
            System.out.print("Palindrome Number");
        }
        else{
            System.out.print("Not a Palindrome Number");
        }
    }
}
