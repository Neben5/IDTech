package imagetest;

import processing.core.PImage;
import processing.core.PApplet;

public class ImageTest extends PApplet {
    public int canvasX=500;
    public int canvasY=500;
    public PImage duck;
    public PImage bg;

    public static void main(String[] args) {
        PApplet.main("imagetest.ImageTest");
    }

    public void settings(){
        size(canvasX,canvasY);
    }

    public void setup(){
        duck=loadImage("Images/Duck.png");
        bg=loadImage("Images/Sky.png");
    }

    public void draw(){
        background(bg);
        duck.resize(300,300);
        tint(150,150,250,255);
        image(duck,0,0);

    }

}

