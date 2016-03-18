

public class StringReverse
{
    public static String reverse(String text)
    {
        if(text.length()==1)
        {
            return text;
        }        
        char c=text.charAt(0);
        String rest=text.substring(1);
        String reverseText=reverse(rest);
        reverseText+=c;
        return reverseText;
    }
    public static String reverseIter(String text)
    {
        String reverseText="";
        for (int i=text.length()-1;i>=0;i--)
        {   
            reverseText+=text.charAt(i);
        }        
        return reverseText;
    }
    public static void main()
    {
       // System.out.println(StringReverse.reverse("Introduction The goal of this lab is to create a recursive algorithm to draw a tree.\n Imagine you were describing how to draw a tree. You might say:\n Draw a vertical line At the top of the line, draw two smaller lines (branches) in a v shape At the ends of each of those two branches,\n draw two even smaller branches Keep repeating the process, drawing smaller and smaller branches until the branches are too small to draw"));
       System.out.println(StringReverse.reverseIter("a man a plan a canal panama"));
       System.out.println("a man a plan a canal panama - Expected");
    }
}
