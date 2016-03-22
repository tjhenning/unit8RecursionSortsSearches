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
        //https://www.google.com/?safe=active&ssui=on
        //https://libraryofbabel.info/book.cgi?0-w1-s4-v17:1          
        URL page=new URL(in.next()); 
        InputStream wut=page.openStream();
        in = new Scanner(wut);             
        
        
//         
//         PrintWriter out=new PrintWriter("output.txt");                                  
//         out.println("u borked it");
//         
//         out.close();
    }
}
