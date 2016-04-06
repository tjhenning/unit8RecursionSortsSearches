
import java.util.Arrays;
import java.util.ArrayList;

public class BucketSort  //aka random sort
{
    public static void main()
    {
        
        int[] arr=ArrayUtil.randomIntArray(7,400);
        System.out.println(Arrays.toString(arr));
        arr=BucketSort.putInBuckets(arr,3);
        //arr=BucketSort.putInBuckets(arr,1);
        //arr=BucketSort.putInBuckets(arr,1);
        System.out.println(Arrays.toString(arr));
        
    }
    public static int[] putInBuckets(int[] a, int index)
    {
        ArrayList<ArrayList<Integer>> allNumbers=new ArrayList<ArrayList<Integer>>();
        
        for (int i=0;i<10;i++)
        {
            allNumbers.add(new ArrayList<Integer>());
        }
        for (int element:a)
        {
            String num1=Integer.toString(element);      
            char num=0;
            try
            {
                num=num1.charAt(num1.length()-index);
            }
            catch(Exception e)
            {
                num=0;
            }
            
            allNumbers.get(Character.getNumericValue(num)).add(element);
            
        }
        int[] newlist=new int[a.length];
        int count=0;        
        
        for (ArrayList<Integer> number:allNumbers)
        {
            if (number.size()!=0)
            {
                for (Integer i:number)
                {
                    newlist[count]=i;
                    count++;
                }
            }
        }
        return newlist;
    }
}
