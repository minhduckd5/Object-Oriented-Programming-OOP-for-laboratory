import java.awt.Graphics;

import javax.swing.JPanel;

public class DesignPanel4 extends JPanel {
    private static final int STEPS = 100;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        //center point
        int xcenter = width/2;
        int ycenter = height/2;

        //draw rectangular spiral
        int i=0, n=10, y1=ycenter,x1=xcenter,x2=xcenter,y2=ycenter;
        while(i<STEPS)
        {   
            y2=y1+n;                    //down
            g.drawLine(x1,y1,x2,y2);
            x1=x2;y1=y2;                //end point becomes start point

            x2=x1-n;                    //left
            g.drawLine(x1,y1,x2,y2);
            x1=x2;y1=y2;                //end point becomes start point
            
            n+=10;                      //increase length of line
            
            y2=y1-n;                    //up
            g.drawLine(x1,y1,x2,y2);
            x1=x2;y1=y2;                //end point becomes start point

            x2=x1+n;                    //right
            g.drawLine(x1,y1,x2,y2);
            x1=x2;y1=y2;                //end point becomes start point
            
            n+=10;                       //increase length of line
            i++;
        }


    }

}
