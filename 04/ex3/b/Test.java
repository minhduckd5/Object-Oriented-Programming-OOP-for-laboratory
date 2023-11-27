import javax.swing.JFrame;

public class Test {
            public static void main(String[] args) {

        //new frame
        JFrame frame = new JFrame("Line Drawing App");

        // set the frame to exit when it is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //new panel
        DesignPanel2 panel = new DesignPanel2();

        frame.add(panel); // add panel to the frame
        frame.setSize(400, 400); //set size of the frame
        frame.setVisible(true); //make frame visible
    }
}
