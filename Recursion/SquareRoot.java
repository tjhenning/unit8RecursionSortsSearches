

/**
 * Write a description of class SquareRoot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SquareRoot
{
    public static void main()
    {
        double ans=squareRoot(123,10);
        ans*=10000;
        int temp=(int)ans;
        ans=temp;
        ans/=10000;
        System.out.println("The square root of 123 is "+ans);
        
        
    }
    public static double squareRoot(double x,double g)
    {
        g=(g+(x/g))/2;      
        if (Math.abs(x-(g*g))<.0000001)
        {
            return g;
        }
        else
        {
            return squareRoot(x,g);           
        }
        
    }
}
