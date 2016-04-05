
import java.util.Arrays;
import java.util.ArrayList;

public class BucketSort  //aka random sort
{
    public static void main()
    {
        
        int[] arr=ArrayUtil.randomIntArray(7,400);
        
        
    }
    public static int[] putInBuckets(int[] a, int index)
    {
        ArrayList<Integer> zero=new ArrayList<Integer>();
        ArrayList<Integer> one=new ArrayList<Integer>();
        ArrayList<Integer> two=new ArrayList<Integer>();
        ArrayList<Integer> three=new ArrayList<Integer>();
        ArrayList<Integer> four=new ArrayList<Integer>();
        ArrayList<Integer> five=new ArrayList<Integer>();
        ArrayList<Integer> six=new ArrayList<Integer>();
        //int divBy=Math.pow(10,index-1);
        for (int element:a)
        {
            String num1=Integer.toString(element);
            char num=num1.charAt(num1.length()-index);
            if (num=='0')
            {
                zero.add(element);
            }
            else if (num=='1')
            {
                one.add(element);
            }else if (num=='2')
            {
                two.add(element);
            }else if (num=='3')
            {
                three.add(element);
            }else if (num=='4')
            {
                four.add(element);
            }else if (num=='5')
            {
                five.add(element);
            }else if (num=='6')
            {
                six.add(element);
            }
            
            
        }
        
        return null;
    }
}
