//********************************************************************
//  KochPanel.java       Author: Lewis/Loftus/Cocking
//
//  Represents a drawing surface on which to paint a Koch Snowflake.
//********************************************************************

import java.awt.*;
import javax.swing.JPanel;

public class Backup extends JPanel
{
   private final int PANEL_WIDTH = 400;
   private final int PANEL_HEIGHT = 400;

   private final double SQ = Math.sqrt(3.0) / 6;

   private final int X1 = 200, Y1 = 280;
   private final int X2=200,Y2=380;

   private int current; //current order
   private final int MAX=9;

   //-----------------------------------------------------------------
   //  Sets the initial fractal order to the value specified.
   //-----------------------------------------------------------------
   public Backup (int currentOrder)
   {
      current = currentOrder;
      setBackground (Color.black);
      setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
   }

   //-----------------------------------------------------------------
   //  Draws the fractal recursively. Base case is an order of 1 for
   //  which a simple straight line is drawn. Otherwise three
   //  intermediate points are computed, and each line segment is
   //  drawn as a fractal.
   //-----------------------------------------------------------------
   public void drawFractal (int order, int x1, int y1, int x2, int y2, int angle,
                            Graphics page)
   {
       page.drawLine (x1, y1, x2, y2);
      if (order == 1)
      {
          return;
      }
      else
      {                  
         int deltax= (int)(Math.cos(Math.toRadians(angle))*Math.pow((MAX-order),2));         
         int deltay= (int)(Math.sin(Math.toRadians(angle))*Math.pow((MAX-order),2));
         System.out.println(x1+"  "+y1);
         drawFractal (order-1, x1+deltax, y1+deltay, x1, y1, angle+10, page);
         drawFractal (order-1, x1-deltax, y1-deltay, x1, y1, angle-10, page);         
      }
   }

   //-----------------------------------------------------------------
   //  Performs the initial calls to the drawFractal method.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics page)
   {
      super.paintComponent (page);

      page.setColor (Color.green);

      drawFractal (current, X1, Y1, X2, Y2, 90, page);
      //drawFractal (current, LEFTX, LEFTY, RIGHTX, RIGHTY, page);
      //drawFractal (current, RIGHTX, RIGHTY, TOPX, TOPY, page);
   }

   //-----------------------------------------------------------------
   //  Sets the fractal order to the value specified.
   //-----------------------------------------------------------------
   public void setOrder (int order)
   {
      current = order;
   }

   //-----------------------------------------------------------------
   //  Returns the current order.
   //-----------------------------------------------------------------
   public int getOrder ()
   {
      return current;
   }
}
