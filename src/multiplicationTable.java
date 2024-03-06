import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        logicmultitable();
    }
    public static void logicmultitable(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=input.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(i+ "*"+num+"="+i*num);
            i++;
        }
    }
}
