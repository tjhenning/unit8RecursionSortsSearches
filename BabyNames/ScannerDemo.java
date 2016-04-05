
import java.util.Scanner;

public class ScannerDemo {

   public static void main(String[] args) {

   String s = "dt><span class=\"strong\">See Also:</span></dt><dd><a href=\"../../java/awt/geom/PathIterator.html\" title=\"interface in java.awt.geom\"><code>PathIterator</code></a>, <a href=\"../../java/awt/geom/AffineTransform.html\" title=\"class in java.awt.geom\"><code>AffineTransform</code></a>,";

   // create a new scanner with the specified String Object
   Scanner scanner = new Scanner(s);

   // print a line of the scanner
   //System.out.println("" + scanner.nextLine());

   // change the delimiter of this scanner
   scanner.useDelimiter("<a");
   // display the new delimiter
   //while (scanner.hasNext())
    //    {
        scanner.next();
            System.out.println("" + scanner.next());
            System.out.println("" + scanner.next());
            //System.out.println("" + scanner.next());
   //     }

   // close the scanner
   scanner.close();
   }
}