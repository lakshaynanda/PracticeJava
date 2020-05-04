public class ArrayPrint {
    public static void printArray(int arr[],int n,int idx)
    {
        if(idx==n)
        {
            return;
        }
        System.out.println(arr[idx]);
        printArray(arr, n, idx+1);
    }
    public static void main(String args[])
    {
        int arr[]={10,20,30,40};
        printArray(arr, arr.length, 0);
    }    
}