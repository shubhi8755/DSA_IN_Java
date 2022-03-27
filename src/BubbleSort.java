public class BubbleSort {
    public void Sort(int arr[]){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
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
        BubbleSort obj=new BubbleSort();
        int arr[]={5,1,4,2,8};
        obj.print(arr);
        System.out.println("after sorting:");
        obj.Sort(arr);
        obj.print(arr);
    }
}
