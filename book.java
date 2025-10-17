public class book {
    String title;
    String authour;
    int price;
    book(String t, String a, int p){
        title=t;
        authour=a;
        price=p;
    }

    void displayBook(){
         System.out.println(title);
        System.out.println(authour);
        System.out.println(price);
    }
}
