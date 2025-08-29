import java.util.Scanner;
public class lefttriangle {
        public static void main(){
        System.out.print("Enter a  number:");
        Scanner number=new Scanner(System.in);
        int num=number.nextInt();
        for(int i=num;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
                System.out.print("\n");
        }
        number.close();
    }
}
