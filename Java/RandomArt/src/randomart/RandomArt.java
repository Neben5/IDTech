package randomart;
import processing.core.PImage;
import processing.core.PApplet;
import java.util.Random;
public class RandomArt extends PApplet{
    float xPos;
    float yPos;
    float r;
    float g;
    float b;
    float diameter;
    int startTime;
    int timer;
    public static void main (String[] args) {
        PApplet.main("randomart.RandomArt");
    }
    public void setup(){
        background(255);
        startTime=millis();
    }
    public void settings(){
        size(450,450);
    }
    public void draw(){
        timer=millis()-startTime;

        if (timer<=1000){
            drawCircle();
        }
        else {
            System.exit(0);
        }
    }
    public void drawCircle(){
        xPos=random(width);
        yPos=random(height);
        diameter=random(100)+50;
        r=random(255);
        g=random(255);
        b=random(255);
        noStroke();
        fill(r,g,b,100);
        ellipse(xPos,yPos,diameter,diameter);
    }
}
