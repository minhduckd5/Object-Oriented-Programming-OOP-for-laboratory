import java.awt.Graphics;

import javax.swing.JPanel;

public class DesignPanel2 extends JPanel {
    private static final int STEPS = 15;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        int xdelta = width / STEPS;
        int ydelta = height / STEPS;

        //upper left corner
        int i = 0;
        while(i<STEPS)
        {
            int x1 = 0;
            int y1 = 0;
            int x2 = width - i * xdelta;
            int y2 = i * ydelta;

            g.drawLine(x1, y1, x2, y2);
            i++;
        }

        //upper right corner
        i=0;
        while(i<STEPS)
        {
            int x1 = width;
            int y1 = 0;
            int x2 = width -i * xdelta;
            int y2 = height - i * ydelta;

            g.drawLine(x1, y1, x2, y2);
            i++;
        }

        //lower left corner
        i=0;
        while(i<STEPS)
        {
            int x1 = 0;
            int y1 = height;
            int x2 = width - i * xdelta;
            int y2 = height - i * ydelta;

            g.drawLine(x1, y1, x2, y2);
            i++;
        }

        //lower right corner
        i=0;
        while(i<STEPS)
        {
            int x1 = width;
            int y1 = height;
            int x2 = width -i * xdelta;
            int y2 = i * ydelta;

            g.drawLine(x1, y1, x2, y2);
            i++;
        }

        
    }

}
