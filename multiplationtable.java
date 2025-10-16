import java.util.Scanner;
public class multiplationtable {
    void multiple(int a) {
        int i = 0;
        for(i = 1; i <= 10; i++){
        System.out.println(a + "x " + i + " = " + a * i);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int num = sc.nextInt();
        multiplationtable mt = new multiplationtable();
        mt.multiple(num);
        sc.close();
    }
}
