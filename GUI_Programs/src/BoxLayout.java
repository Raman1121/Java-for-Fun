import javafx.embed.swing.JFXPanel;


import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoxLayout implements ActionListener{

    static JButton button1 = new JButton("Button 1");
    static JButton button2 = new JButton("Button 2");

    public void go(){
        JFrame frame = new JFrame("Box Layout");
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setLayout(new javax.swing.BoxLayout(panel, javax.swing.BoxLayout.Y_AXIS));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panel.add(button1);
        panel.add(button2);

        button1.addActionListener(this);
        button2.addActionListener(this);

        frame.getContentPane().add(BorderLayout.EAST,panel);

        frame.setSize(200,200);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        BoxLayout bl = new BoxLayout();
        bl.go();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
           JFrame frame2 = new JFrame("Button1 frame");
        }
        else if(e.getSource() == button2){

        }

    }
}
