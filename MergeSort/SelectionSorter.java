import java.util.Arrays;

public class SelectionSorter
{
    
    public static void sort(int[] a)
    {
        System.out.println(Arrays.toString(a));
        for (int i=0; i<a.length;i++)
        {
            int minPos=minimumPosition(a,i);
            ArrayUtil.swap(a,minPos,i);
        }
        System.out.println(Arrays.toString(a));
    }
    
    private static int minimumPosition(int[] a, int from)
    {
        int minPos=from;
        for (int i=from; i<a.length;i++)
        {
            if (a[i]<a[minPos])
            {
                minPos=i;
            }
        }
        return minPos;
    }
    public static void main()
    {
        int[] a=ArrayUtil.randomIntArray(20,100);
        SelectionSorter.sort(a);
    }
}
