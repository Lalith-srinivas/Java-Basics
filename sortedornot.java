public class sortedornot {
    public static void main(String[] args){
        int arr[]={2,4,5,6,7,8};
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                count=count+1;
            }
        }
        if(count>0){
            System.out.println("Array is Not Sorted");
        }
        else{
            System.out.println("Array is Sorted");
        }
    }
}
