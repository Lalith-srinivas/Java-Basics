import java.util.Scanner;
public class celsiustofar {
    int temp(int a){
        return (a*9/5)+32;
    }
    public static void main(String[] args) {
        System.out.print("Enter a Temperature: ");
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        celsiustofar ctf= new celsiustofar();
        System.out.println(t+" c to fahrenheit is: "+ ctf.temp(t)+" F");
        sc.close();
    }
}
