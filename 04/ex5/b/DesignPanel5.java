import java.awt.Graphics;

import javax.swing.JPanel;

public class DesignPanel5 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        //center point
        int x = getSize().width / 2;
        int y = getSize().height/ 2;

        //starting area >> we then expand later in the loop
        int width = 20;
        int height = 20;

        int startAngle = 0;
        int arcAngle = 180;

        int depth = 20; //steps
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {                                            //draw lower curve

                y = y - depth;
                width = width + 2 * depth;
                height = height + 2 * depth;
                g.drawArc(x, y, width, height, startAngle, arcAngle);
            } else {

                x = x - 2 * depth;                                      //draw upper curve
                y = y - depth;
                width = width + 2 * depth;
                height = height + 2 * depth;
                g.drawArc(x, y, width, height, startAngle, -arcAngle);
            }
        }

    }

}
