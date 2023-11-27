import java.awt.Graphics;

import javax.swing.JPanel;

public class LineDrawingApp extends JPanel {
    public void paintComponent(Graphics g) {

        // call paintComponent to ensure the panel displays correctly
        super.paintComponent(g);
        
        //size of the panel
        int width = getWidth();
        int height = getHeight();
        
        //Center point
        int centerX = width / 2;
        int centerY = height / 2;
        
        // Draw four lines intersecting at the center point

        //2 lines vertical and horizontal
        g.drawLine(centerX, 0, centerX, height);
        g.drawLine(0, centerY, width, centerY);

        //2 lines diagonal
        g.drawLine(0, 0, width, height);
        g.drawLine(0, height, width, 0);
    }
    

}
