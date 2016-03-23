import java.util.Scanner;
import java.net.URL;
import java.io.PrintWriter;
import java.io.InputStream;
public class Webpage
{
    
    public static void main() throws Exception
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Give webpage URL.");
        //http://www.google.com/?gws_rd=ssl&safe=active&ssui=on
        //http://libraryofbabel.info/book.cgi?0-w1-s4-v17:1   
        //http://en.wikipedia.org/wiki/Randomness (doesn't work)
        //http://docs.oracle.com/javase/7/docs/api/java/awt/Shape.html
        URL page=new URL(in.next()); 
        InputStream wut=page.openStream();
        in = new Scanner(wut);
        PrintWriter out=new PrintWriter("output.txt");
        while (in.hasNext())
        {
            out.println(in.nextLine());
        }
        in=new Scanner(page.openStream());
        in.useDelimiter("<li><a href=");
        while (in.hasNext())
        {
            System.out.println(in.nextLine());            
        }
         System.out.println("Done");
        out.close();
    }
}
