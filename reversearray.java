public class reversearray {
    void reverseArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        reversearray ra=new reversearray();
        int a[]={1,2,3,4,5,6};
        ra.reverseArray(a);
        for(int element: a){
            System.out.print(element+" ");
        }
    }
}
