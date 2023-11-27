import java.awt.Graphics;

import javax.swing.JPanel;
import java.util.ArrayList;

import java.util.Random;
import java.awt.Color;


public class Bars extends JPanel {
    ArrayList<Integer> number_bars = new ArrayList<Integer>();
    Random rand = new Random();

    //constructor
    public Bars(ArrayList<Integer> number_bars) {
        this.number_bars = number_bars;
    }

    //draw a cascade of bars
    public void paintComponent(Graphics g) {
        int i = 1;
        for (Integer len : number_bars){
            //draw bars
            g.fillRect(0, i*40, len, 20);   //fill color
            g.setColor(new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256))); //generate random color
            i++;
        }
    }
}
