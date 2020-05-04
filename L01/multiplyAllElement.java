public class multiplyAllElement {

    public static int mulElement(int arr[],int idx)
    {
        if(idx==arr.length)
        {
            return 1;
        }

        int ans=arr[idx]*mulElement(arr, idx+1);

        return ans;
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4};
        System.out.println(mulElement(arr, 0));
    }
}