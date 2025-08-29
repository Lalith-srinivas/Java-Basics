import java.util.Scanner;
public class difftriangel {
    public static void main(String[] args){
        Scanner number=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=number.nextInt();
        int count=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" " +count);
                count++;
            }
            System.out.print("\n");
        }
        number.close();
    }
}
