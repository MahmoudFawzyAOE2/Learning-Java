import java.awt.*;
import java.util.*;
import javax.swing.*;

class Picture extends JComponent {
    public void paint(Graphics g) {

        // lamp core
        g.setColor(Color.blue);
        g.fillRect(100,250,100,30);

        // lamp core
        g.drawLine(125, 250, 140, 158);
        g.drawLine(175, 250, 160, 158);

        //g.drawOval(100, 100, 200, 120);
        g.setColor(Color.green);
        g.drawArc(85, 157, 130, 50, -74, 330);
        g.drawArc(85, 87, 130, 50, 62, 58);
        g.setColor(Color.black);
        g.drawLine(85, 177, 119, 89);
        g.drawLine(215, 177, 181, 89);

        //g.fillArc(78,120,40,40,63,-174);
        g.fillOval(120,100,20,20);
        g.fillOval(160,100,20,20);
        //g.fillArc(173,100,40,40,110,180);
        g.setColor(Color.red);
        g.fillArc(132,115,40,30,0,-180);


    }
}
public class Main {
    public static void main(String[] args){

        // Create a new JFrame window
        JFrame frame = new JFrame("Lamp Drawing");

        // Create an instance of the Picture class
        Picture picture = new Picture();

        // Set the size of the window
        frame.setSize(400, 400);

        // Add the Picture component to the frame
        frame.add(picture);

        // Make the frame visible
        frame.setVisible(true);

        // Close the program when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }//end of main
}//end of class