import java.awt.*;
import javax.swing.*;

public class applet_1 extends JApplet{

    public JTextField rate = new JTextField();
    public JTextField years = new JTextField();
    public JTextField amount = new JTextField();
    public JTextField interest = new JTextField();

    public JLabel rateLabel = new JLabel("Rate of interest");
    public JLabel yearsLabel = new JLabel("Time period");
    public JLabel amountLabel = new JLabel("Amount");
    public JLabel interestLabel = new JLabel("Calculated Interest");

    JFrame frame = new JFrame();
    JPanel leftPanel = new JPanel();
    JPanel rightPanel = new JPanel();


    public void buildGUI(){

        leftPanel.add(rateLabel);
        leftPanel.add(yearsLabel);
        leftPanel.add(amountLabel);
        leftPanel.add(interestLabel);

        rightPanel.add(rate);
        rightPanel.add(years);
        rightPanel.add(amount);
        rightPanel.add(interest);

        frame.getContentPane().add(BorderLayout.WEST, leftPanel);
        frame.getContentPane().add(BorderLayout.EAST, rightPanel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        applet_1 applet = new applet_1();
        applet.buildGUI();
    }
}
