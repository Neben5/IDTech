package menus;
import processing.core.PApplet;

public class Menus extends PApplet {
    public int winner =-1;
    public int score = 0;
    public int highScore=0;
    enum GameState {
        START, OVER, RUNNING
    }
    static GameState currentState;
    public static void main(String[] args) {
        PApplet.main("menus.Menus");

    }
    public void settings(){
        size(500,500);
    }
    public void setup(){
        currentState = GameState.START;
    }
    public void draw(){
        background(255);
        switch (currentState) {
            case START:
                drawStart();
                break;
            case OVER:
                drawGameOver();
                break;
            case RUNNING:
                drawRunning();
                break;
        }
    }
    public void mousePressed(){
        if (mouseX > (width / 2 - 25) && mouseX < (width / 2 + 25) && mouseY > height / 2 + 20 && mouseY < (height / 2 + 20 + 25)) {

            currentState = GameState.RUNNING;

        }else if(currentState==GameState.RUNNING){
            winner = (int) random(0, 3);
            score = (int) random(0, 100);
            if (score > highScore) {
                highScore = score;
            }
            print(winner);
            currentState = GameState.OVER;
        }
    }
    public void drawStart(){
        fill(232, 248, 253);
        noStroke();
        rect(width / 2 - 125, height / 2 - 100, 250, 200);
        fill(20, 185, 235); // 255
        textAlign(CENTER);
        text("Welcome!\nClick the mouse to generate a\n random number and winner.", width / 2, height / 2 - 20);
        //button
        fill(116, 210, 241);
        stroke(255);
        rect(width / 2 - 25, height / 2 + 20, 50, 25);
        fill(255);
        textAlign(CENTER);
        text("Start", width / 2, height / 2 + 36);
        if (mouseX > (width / 2 - 25) && mouseX < (width / 2 - 25 + 50) && mouseY > height / 2 + 20 && mouseY < (height / 2 + 20 + 25)) {
            fill(130, 235, 241);
            stroke(255);
            rect(width / 2 - 25, height / 2 + 20, 50, 25);
            fill(200);
            textAlign(CENTER);
            text("Start", width / 2, height / 2 + 36);
        }

    }
    public void drawGameOver(){
        fill(255, 190, 190);
        noStroke();
        rect(width / 2 - 125, height / 2 - 80, 250, 160);
        fill(255, 100, 100); // 255
        textAlign(CENTER);
        text("Game Over!", width / 2, height / 2 - 50);
        if (winner == 0) {
            text("Player 1 wins!", width / 2, height / 2 - 30);
        } else if (winner == 1) {
            text("Player 2 Wins", width / 2, height / 2 - 30);
        } else if (winner == 2) {
            text("Draw", width / 2, height / 2 - 30);
        }
        text("High Score " + highScore, width / 2, height / 2 - 10);
    }
    public void drawRunning(){
        fill(217, 255, 179);
        noStroke();
        rect(width / 2 - 200, height / 2 - 100, 400, 200);
        fill(20, 185, 235); // 255
        textAlign(CENTER);
        text("Game on!", width / 2, height / 2 - 30);
        textAlign(RIGHT);
        text("Click to generate a winner!", width / 2, height / 2 - 10);
        textAlign(LEFT);
        text("Try to break the high score!\nCurrent high score: " + highScore, width / 2, height / 2 + 5);
    }
}