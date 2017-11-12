import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField implements ActionListener {
    static JTextField field = new JTextField("My field");
    static JFrame frame = new JFrame("My frame");
    static JPanel panel = new JPanel();

    public void go(){
        field.requestFocus();
        field.addActionListener(this);
        field.setVisible(true);
        field.setSize(100,50);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(field);
        frame.getContentPane().add(panel);
        frame.setSize(200,200);
        frame.setVisible(true);
        frame.add(field);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == field){
            field.setText("I was clicked i guess");
        }
    }

    public static void main(String[] args){
        TextField f = new TextField();
        f.go();
    }
}
