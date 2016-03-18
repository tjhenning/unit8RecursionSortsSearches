

/**
 * Write a description of class SubstringGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SubstringGenerator
{
    public static void main()
    {
       generateSubstrings("Pattern",0);
        
    }
    public static void generateSubstrings(String str,int start)
    {
        if(start!=str.length())        
        {
             for(int i=start+1;i<=str.length();i++)
            {
                System.out.println(str.substring(start,i));
            }
            generateSubstrings(str,start+1);
        }
        
    }
}
