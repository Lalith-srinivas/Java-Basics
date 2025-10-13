import java.util.Scanner;
public class stringtolowercase{
    public static void main(String[] args){
        System.out.print("Enter a String:");
        Scanner string = new Scanner(System.in);
        String name= string.nextLine();
        string.close();
        System.out.println("String You Entered:"+name);
        String namelower=name.toLowerCase();
        System.out.println("String After Converting into Lowercase:"+namelower);
    }
}