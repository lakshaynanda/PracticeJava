public class firstOccData {

    public static int firstIndData(int arr[],int i,int data)
    {
        if(i==arr.length)
        {
            return -1;
        }
        if(arr[i]==data)
        {
            return i;
        }

        return firstIndData(arr, i+1, data);

    }
    public static int lastIndex(int arr[],int i,int data)
    {
        if(i==arr.length)
        {
            return -1;
        }
        int ans=lastIndex(arr, i+1, data);
        if(ans!=-1)
        {
            return ans;
        }
        if(arr[i]==data)
        {
            return i;
        }
        return -1;

    }
    public static int[] allIndex(int arr[],int i,int data,int count)
    {
        if(i==arr.length)
        {
            return new int[count];
        }

        if(arr[i]==data)
        {
            count++;
        }
        int[] ans=allIndex(arr, i+1, data, count);

        if(arr[i]==data)
        {
            ans[count-1]=i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={10,20,20,20,40,20,98,20};
        int ans[]=allIndex(arr, 0, 20,0);

        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        }

        // char c[][]={{'a'},{'b'},{'c','d'}};
        // c[1]=c[2];
        // c=new char[][] {{'a'},{'b'},{'c'},{'d'}};
        // for(int i=0;i<c.length;i++)
        // {
        //     for(int j=0;j<c[0].length;j++)
        //     {
        //         System.out.print(c[i][j]);
        //     }
        // }
    }
}