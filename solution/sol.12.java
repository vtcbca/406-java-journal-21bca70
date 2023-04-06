import java.awt.*;
import java.applet.*;
public class prog_10 extends Applet {
    private int numOvals;
    public void init() {
        String numOvalsStr = getParameter("numOvals");
        numOvals = Integer.parseInt(numOvalsStr);
    }
    public void paint(Graphics g) {
        for (int i = 0; i < numOvals; i++) {
            int x = (int)(Math.random() * 300);
            int y = (int)(Math.random() * 300);
            int w = (int)(Math.random() * 100);
            int h = (int)(Math.random() * 100);
            g.drawOval(x, y, w, h);
        }
    }
}
/*<applet code="prog_10.class" height="800" width="1860">
<param name="numOvals" value="10">
</applet>*/
