import java.util.Scanner;
public class replacespaces {
    public static void main(String[] args){
        System.out.print("Enter a String:");
        Scanner str=new Scanner(System.in);
        String str1= str.nextLine();
        str.close();
        System.out.println("String Before Replacing whitespaces with underscore: "+str1);
        String str2=str1.replace(' ','_');
        System.out.println("String After replacing whitespaces with underscore: "+str2);
    }
}
