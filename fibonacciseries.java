import java.util.Scanner;
public class fibonacciseries {
    public static void main(String[] args){
        int first=0;
        int second=1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit for Fibonacci Series: ");
        int limit = scanner.nextInt();
        scanner.close();
        System.out.print("Fibonacci Series: "+first+" "+second);
        for(int i=2;i<limit;i++){
            int next=first+second;
            System.out.print(" "+next);
            first=second;
            second=next;
        }
    }
}
