import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaExample implements ActionListener{

    static JTextArea area;
    static JFrame frame;
    static JPanel panel;
    static JButton button;

    public void go(){
        frame = new JFrame("New Frame");
        panel = new JPanel();
        area = new JTextArea(10,20);
        button = new JButton("CLick Me!");
        button.addActionListener(this);
        area.setLineWrap(true);

        JScrollPane scroll = new JScrollPane(area);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.add(scroll);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setSize(350, 300);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        area.append("I was clicked\n");
    }

    public static void main(String[] args){
        TextAreaExample te = new TextAreaExample();
        te.go();
    }
}
