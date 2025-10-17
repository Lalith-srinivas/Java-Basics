public class Rectangle {
    int length;
    int width;
    Rectangle(){
        length=1;
        width=1;
    }
    Rectangle(int l, int w){
        length=l;
        width=w;
    }
    int area(){
        return length*width;
    }
    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
        System.out.println(r1.area());
        Rectangle r2=new Rectangle(2,3);
        System.out.println(r2.area());
    }
}
