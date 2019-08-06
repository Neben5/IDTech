
import processing.core.PApplet;

public class MouseInput extends PApplet {
    public boolean hover=false;
    public static void main(String[] args) {
        PApplet.main("MouseInput");
    }

    float boxX = 350;
    float boxY = 250;
    int width = 100;
    int height = 100;
    int canvasX = 800;
    int canvasY=600;

    public void settings() {
        size(canvasX, canvasY);
    }

    public void setup() {
        background(255,255,255);
    }

    public void draw() {
        background(255, 255, 255);

        if (mouseX > boxX && mouseX < boxX + width && mouseY > boxY && mouseY < boxY + height) {
            fill(0, 0, 0);
            hover=true;
        }

        else {
            fill(255, 0, 0);
            hover=false;
        }
        if(boxX<0){
            boxX=0;
        }else if(boxY<height/2){
            boxY=0;
        }
        if(boxX>canvasX-width){
            boxX=canvasX-width;
        }else if(boxY>canvasY-height){
            boxY=canvasY-height;
        }
        rect(boxX, boxY, width, height);
    }

    public void mouseDragged() {
        if(hover){
            boxX=mouseX-width/2;
            boxY=mouseY-height/2;
        }
    }

    public void mousePressed() {

    }

    public void mouseReleased() {

    }
}