public class Countoccurrences {
    int count(int arr[],int key){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Countoccurrences co=new Countoccurrences();
        int a[]={1,2,3,4,2,2};
        System.out.println(co.count(a,2));
    }
}
