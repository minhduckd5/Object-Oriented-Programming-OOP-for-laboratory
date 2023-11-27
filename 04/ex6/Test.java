
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> number_bars = new ArrayList<Integer>();

        JFrame application = new JFrame("Bar Chart Printing Program"); //make new jframe
        for (int i = 0; i < 5;i++){
            int n = i+1;
            String input = JOptionPane.showInputDialog("Enter the length of the bar "+n);
            int len=Integer.parseInt(input);
            number_bars.add(len);
        }
        Bars panel = new Bars(number_bars);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        // set the frame to exit when it is closed
        application.setSize(300,300);
        application.add(panel);
        application.setVisible(true);
    }
}
