import java.awt.Graphics;

import javax.swing.JPanel;

public class DesignPanel3 extends JPanel {
    private static final int STEPS = 15;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        int xdelta = width / STEPS;
        int ydelta = height / STEPS;

        int i = 0,y1=0,x2=5;
        while(i<STEPS)
        {   
            y1+=ydelta;
            x2+=xdelta;
            g.drawLine(0, y1,x2,height); //start from top left
            g.drawLine(width, y1,x2,0); //start from top right
       
            i++;
        }
        i = 0;
       
        y1=height;
        x2=5;
        while(i<STEPS)
        {   
            y1-=ydelta;
            x2+=xdelta;
            g.drawLine(0,y1,x2,0); //start from bottom left
            g.drawLine(width,y1,x2,height); //start from bottom right
            i++;
        }

    }

}
