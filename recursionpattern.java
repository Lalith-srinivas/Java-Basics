public class recursionpattern {
     void trianglerecrusion(int n){
        if(n>0){
            for(int i=0;i<n;i++){
                System.out.print("* ");
            }
            System.out.println();
            trianglerecrusion(n-1);
        }
    }
    public static void main(String[] args) {
        recursionpattern rp=new recursionpattern();
        rp.trianglerecrusion(4);
    }
}
