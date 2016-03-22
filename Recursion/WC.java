import java.util.Scanner;
import java.io.File;

public class WC
{
   public static void main()   
   {
       File adress=new File("GitHubLog.txt");
       int i=0;
       Scanner in=new Scanner(System.in);
       try
       {                     
           in=new Scanner(adress);
        }
       catch(Exception e)
       {
           System.out.println("U borked it ");
       }
       
       try
       {                     
           //in.useDelimiter("");           
           while(i!=-1)
           {
               in.next();
               i++;           
           }
        }
       catch(Exception e)
       {
           System.out.println("\"Words\": "+i);
       }
       i=0;
       try
       {                     
           in=new Scanner(adress);
           in.useDelimiter("");           
           while(i!=-1)
           {
               in.next();
               i++;           
           }
        }
       catch(Exception e)
       {
           System.out.println("Characters: "+i);
       }
       i=0;
       try
       {                     
           in=new Scanner(adress);
           //in.useDelimiter("");           
           while(i!=-1)
           {
               in.nextLine();
               i++;           
           }
        }
       catch(Exception e)
       {
           System.out.println("Lines: "+i);
       }
       
       
    }
}
