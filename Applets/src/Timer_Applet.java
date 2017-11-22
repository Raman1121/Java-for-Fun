import javafx.scene.input.DataFormat;


import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Label;
import java.text.DateFormat;
import java.util.Date;

public class Timer_Applet extends Applet implements Runnable{

    Label time;
    DateFormat timeFormat;
    Thread timer;
    volatile boolean running;

    public void init(){
        time = new Label();
        time.setAlignment(Label.CENTER);
        setLayout(new BorderLayout());
        add(time, BorderLayout.CENTER);
        timeFormat = DateFormat.getTimeInstance(DateFormat.MEDIUM);
    }

    public void start(){
        running = true;
        if(timer == null){
            timer = new Thread();
            timer.start();
        }
    }

    @Override
    public void run() {
        while(running){
            time.setText(timeFormat.format(new Date()));
            try{
                timer.sleep(1000);      //Sleep for 1 sec
            }catch(InterruptedException e){

            }
            timer = null;
        }
    }

    public void stop() {
        running = false;
    }
}
