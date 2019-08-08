package duckanimation;
import processing.core.PApplet;
import processing.core.PImage;
public class DuckAnimation extends PApplet {
    int numOfImages=2;
    PImage[] duckImages;
    int imageIndex=0;
    public static void main(String[] args) {
        PApplet.main("duckanimation.DuckAnimation");
    }
    public void settings(){
        size(300,300);
    }
    public void setup(){
        duckImages=new PImage[numOfImages];
        duckImages[0]=loadImage("Images/Duck1.png");
        duckImages[1]=loadImage("Images/Duck2.png");
        frameRate(10);
    }
    public void draw(){
        background(255,255,255);
        image(duckImages[imageIndex], 50, 150);
        imageIndex=(imageIndex+1)%numOfImages;
    }
}
