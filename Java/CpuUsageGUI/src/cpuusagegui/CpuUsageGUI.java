package cpuusagegui;
import processing.core.PFont;
import processing.core.PApplet;
import  java.util.concurrent.TimeUnit;
public class CpuUsageGUI  extends PApplet{
    public int canvasX=600;
    public int canvasY=1000;
    public int listenerState=0;
    PFont font;
    public Listener listener;
    public static void main(String[] args){
        PApplet.main("cpuusagegui.CpuUsageGUI");
    }
    public void setup(){
        font = createFont("Arial", 20, true);
    }
    public void settings(){
        size(canvasX,canvasY);
    }
    public void draw () {
        if (listenerState==0){
            try{
            listener = new Listener();}catch (Exception e){}
        }
        System.out.println("drawing");
        background(255);
        print();
        System.out.println("print");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (Exception e){}
    }
    public void print(){
            fill(0, 0, 0);
            try {
                String textString = listener.listen();
                text(textString, canvasX / 2, canvasY / 2);
            } catch (Exception e){

            }
    }

}
