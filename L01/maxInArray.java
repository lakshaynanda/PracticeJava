public class maxInArray {

    public static int maxInarray(int arr[],int i)
    {
        if(i==arr.length-1)
        {
            return arr[i];
        }
        int max=Math.max(arr[i], maxInarray(arr, i+1));
        return max;
    }
    public static void main(String args[])
    {
        int arr[]={40,2,31,29,76,1};
        System.out.println(maxInarray(arr, 0));
    }
    
}