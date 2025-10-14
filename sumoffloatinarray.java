public class sumoffloatinarray {
    public static void main(String[] args){
        float[] arr = {10.5f, 11.2f, 11.1f, 10.1f, 1.2f};
        float sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of array elements is: " + sum);
    }
}
