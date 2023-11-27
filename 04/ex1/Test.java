import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args) {
        JOptionPaneExample name = new JOptionPaneExample();
        
        // Create a message
        String message = String.format("Welcome, %s, to Java Programming!", name.name);
        
        // display the message 
        JOptionPane.showMessageDialog(null, message);
    }
}
