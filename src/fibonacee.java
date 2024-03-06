import java.util.Scanner;

public class fibonacee {
    public static void main(String[] args) {
        logic();

    }
    public static void logic(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=input.nextInt();
        int f=0,s=1,next,i=0;
        while(i<num){
            if(i<=1){
                next=i;
            }
            else{
                next=f+s;
                f=s;
                s=next;
            }
            i++;
            System.out.print(next+" ");
        }
    }
}
