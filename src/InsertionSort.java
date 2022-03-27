//sort the given array using insertion sort algorithm....................................
public class InsertionSort {
    public void Sort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int temp=arr[i];
            int j=i;
            while(j>0 && arr[j-1]>temp){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
    }
    public void print(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertionSort obj=new InsertionSort();
        int arr[]={12, 11, 13, 5, 6};
        System.out.println("before sorting");
        obj.print(arr);
        System.out.println("after sorting");
        obj.Sort(arr);
        obj.print(arr);
    }
}
