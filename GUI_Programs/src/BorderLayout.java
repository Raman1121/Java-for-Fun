import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class BorderLayout implements ActionListener{

        static JFrame frame = new JFrame("First Frame");
        static JButton button1 = new JButton("east button");
        static JButton button2 = new JButton("west button");
        static JButton button3 = new JButton("north button");
        static JButton button4 = new JButton("south button");
        static JButton button5 = new JButton("center button");


    public void go(){


        frame.getContentPane().add(java.awt.BorderLayout.EAST, button1);
        frame.getContentPane().add(java.awt.BorderLayout.WEST, button2);
        frame.getContentPane().add(java.awt.BorderLayout.NORTH, button3);
        frame.getContentPane().add(java.awt.BorderLayout.SOUTH, button4);
        frame.getContentPane().add(java.awt.BorderLayout.CENTER, button5);

        button1.addActionListener((ActionListener) this);
        button2.addActionListener((ActionListener) this);
        button3.addActionListener((ActionListener) this);
        button4.addActionListener((ActionListener) this);
        button5.addActionListener((ActionListener) this);

        frame.setSize(400,400);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        BorderLayout bl = new BorderLayout();
        bl.go();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == (button1))
        button1.setText("I was clicked lol ");

        else if(e.getSource() == (button2))
        button2.setText("I was clicked lol ");

        else if(e.getSource() == (button3))
        button3.setText("I was clicked lol ");

        else if(e.getSource() == (button4))
        button4.setText("I was clicked lol ");

        else if(e.getSource() == (button5))
        button5.setText("I was clicked lol ");

    }
}
