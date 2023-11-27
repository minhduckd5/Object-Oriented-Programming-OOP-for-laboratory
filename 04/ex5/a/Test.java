import javax.swing.JFrame;

public class Test {
            public static void main(String[] args) {

        //new frame
        JFrame frame = new JFrame("Line Spiral App");

        // set the frame to exit when it is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //new panel
        DesignPanel4 panel = new DesignPanel4();

        frame.add(panel); // add panel to the frame
        frame.setSize(300, 300); //set size of the frame
        frame.setVisible(true); //make frame visible
    }
}
