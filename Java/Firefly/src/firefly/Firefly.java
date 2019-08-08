package firefly;
import processing.core.PApplet;
public class Firefly extends PApplet{
    float xPos;
    float yPos;
    float speed;
    public static void main(String[] args) {
        PApplet.main("firefly.Firefly");

    }
    public void settings() {
        size(450, 450);

    }
    public void setup(){
        xPos = width/2;
        yPos = height/2;
        frameRate(30);
        speed=2;

    }
    public void draw(){
        background(255);
        drawFireFly(shake(xPos),shake(yPos));
        xPos = constrain(xPos, 0, width);
        yPos = constrain(yPos, 0, height);

    }
    public float shake(float pos){
        pos+=random(-1,1)*speed;
        return pos;
    }
    public void drawFireFly(float xPos,float yPos){
        System.out.println(xPos + " "+yPos);
        noStroke();
        fill(160, 58, 63);
        ellipse(xPos, yPos-120, 40,40); // Head
        fill(50, 58, 63);
        ellipse(xPos,yPos-50,40,110 ); // Body
        fill(138, 212, 227);
        triangle(xPos, yPos-80, xPos +120, yPos-100, xPos +50, yPos-50); // Right Wing
        triangle(xPos, yPos-80, xPos -120, yPos-100, xPos -50, yPos-50); // Left Wing
        fill(255, 255, 108);
        ellipse(xPos, yPos-10, 30,30); // Light
    }
}
