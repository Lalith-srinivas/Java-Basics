public class someofeven {
    void sum(int [] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sum=sum+arr[i];
            }
        }
        System.out.println("sum: "+sum);
    }
    public static void main(String[] args) {
        someofeven se= new someofeven();
        int a[]={1,2,3,4,5,6};
        se.sum(a);
    }
}