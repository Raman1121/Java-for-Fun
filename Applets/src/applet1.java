import java.applet.*;
import java.awt.*;

public class applet1 extends Applet {
   public void paint (Graphics g) {
      g.drawString ("Hello World", 25, 50);
   }

   public static void main(String[] args){
       applet1 applet = new applet1();
       try{
           applet.paint(null);
       }catch(NullPointerException n){
           System.out.print("BUMMERRRR");
           n.printStackTrace();
       }

   }
}