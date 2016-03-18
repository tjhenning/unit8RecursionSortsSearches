//********************************************************************
//  KochPanel.java       Author: Lewis/Loftus/Cocking
//
//  Represents a drawing surface on which to paint a Koch Snowflake.
//********************************************************************

import java.awt.*;
import javax.swing.JPanel;
//import java.awt.geom.Line2D;

public class KochPanel extends JPanel
{
   private final int PANEL_WIDTH = 600;
   private final int PANEL_HEIGHT = 600;

   private final double SQ = Math.sqrt(3.0) / 6;

   private final int X1 = 310, Y1 = 300;
   private final int X2=300,Y2=380;

   private int current; //current order
   private final int MAX=9;
   private int colors;
   private int change;
   //-----------------------------------------------------------------
   //  Sets the initial fractal order to the value specified.
   //-----------------------------------------------------------------
   public KochPanel (int currentOrder,int sel,int s2)
   {
      colors=sel;
      change=s2;
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
   public void drawFractal (int x1, int y1, int x2, int y2, int angle,
                            Graphics2D page, int numberInSequence, int length)
   {
       int deltax= (int)(Math.cos(Math.toRadians(angle))*length);         
       int deltay= -1*(int)(Math.sin(Math.toRadians(angle))*length);
       Color c=page.getColor();
       
        
       int red=(c.getGreen()+(15*numberInSequence));
       if (red>254)
       {
           red=255;
        }
        Color nc;
        switch (change){
          case 0: nc=new Color(c.getRed(),Math.abs(c.getGreen()-(15*numberInSequence)),red); 
          break;
          case 1:  nc=new Color(Math.abs(c.getRed()-(15*numberInSequence)),red,(c.getBlue()));
          break;
          default: nc=new Color(red,c.getGreen(),Math.abs(c.getBlue()-(15*numberInSequence)));
          break;
        }       
     
       page.setColor(nc);
       if(numberInSequence<10)//can also be 9 for similar effect
       {           
           page.setStroke(new BasicStroke(10-numberInSequence));
           //page.draw(new Line2D.Double(x1+deltax, y1+deltay, x2, y2));
       }
       page.drawLine(x1+deltax, y1+deltay, x2, y2);
        if(x1%7==0)
        {
            if(y2%9==0&&length>5)
            {
                page.setColor(new Color(255,215,0));
                page.fillOval(x1,y1,7,7);
                page.setColor(Color.white);
                page.fillOval(x1+4,y1+1,2,2);
            }
        }
       page.setColor(c);
       if (numberInSequence == current)
       {
          
          return;
       }
       else
       {                         
           if (numberInSequence<=2)
           {
               drawFractal ( x1+deltax, y1+deltay, x1, y1, angle+29, page,numberInSequence+1,length*5/8);
               drawFractal ( x1+deltax, y1+deltay, x1, y1, angle-29, page,numberInSequence+1,length*9/8);       
            }
            else
            {
                drawFractal ( x1+deltax, y1+deltay, x1, y1, angle+29, page,numberInSequence+1,1+(length*9/10));
                drawFractal ( x1+deltax, y1+deltay, x1, y1, angle-10, page,numberInSequence+1,(length*6/7));     
            }
       }
   }

   //-----------------------------------------------------------------
   //  Performs the initial calls to the drawFractal method.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics page)
   {
      super.paintComponent (page);

      System.out.println(colors+"  "+change);
      Graphics2D p2 = (Graphics2D) page; 
      switch (colors){
          case 0:page.setColor (Color.blue);
          break;
          case 1:page.setColor (new Color(142,42,42));//(160,82,45));
          break;
          case 2:page.setColor (Color.red);
          break;
        }
      
      
      drawFractal ( X1, Y1, X2, Y2, 83, p2,1,30);
      
      drawFractal (260,375,305,380,174,p2,1,20 );
      drawFractal (350,385,305,380,353,p2,1,10 );
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
