import java.util.Arrays;


public class BubbleSort  //aka random sort
{
    public static void main()
    {
        int O=0;//O seems to be 2/3 * N^2 on average
        int[] arr=ArrayUtil.randomIntArray(7,10);
        while (!ArrayUtil.isSortedInt(arr))
        {
            for (int i=1;i<arr.length;i++)
            {
                if (arr[i-1]>arr[i])
                {
                    ArrayUtil.swap(arr,i-1,i);
                }
                O++;
                System.out.println(O);//+"   "+Arrays.toString(arr));
            }
        }
        
    }
}
