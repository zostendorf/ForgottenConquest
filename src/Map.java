import java.awt.*;
import javax.swing.JFrame;

public class Map extends GameObject{
    Location currentLocation = new Location();
    
    public void display(){
        MapCanvas mapCanvas = new MapCanvas();
        JFrame frame = new JFrame();
        frame.add(mapCanvas);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}

class MapCanvas extends Canvas{
    public void paint(Graphics g){
        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("imgs/forgottenConquestMap.png");
        g.drawImage(i, 120,100,this);
    }
}