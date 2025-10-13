import java.util.Scanner;
public class lettertemplate {
    public static void main(String[] args){
        String template= "Dear <Name>, Thanks a lot";
        System.out.print("Enter a Name to Send Thank You Letter:");
        Scanner str= new Scanner(System.in);
        String name= str.nextLine();
        String letter= template.replace("<Name>", name);
        System.out.println("This is Thank You Letter: ");
        System.out.println(letter);
        str.close();
    }
}