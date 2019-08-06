package tictactoe;
import processing.core.PApplet;
public class TicTacToe extends PApplet{
    int xCanvas=300;
    int yCanvas=300;
    int cols =3;
    int rows=3;
    int h;
    int w;
    int totalTurns=0;
    int winner=-1;
    GridSquare[][] board= new GridSquare[rows][cols];
    public static void main(String[] args) {
        PApplet.main("tictactoe.TicTacToe");
    }
    public void setup(){
        w=width/cols;
        h=height/rows;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j< cols; j++) {
                board[i][j] = new GridSquare(i * w, j * h, w, h);
            }
        }
    }
    public void settings(){
        size(xCanvas,yCanvas);
    }
    public void draw(){
        background(255);
        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
                stroke(0);
                noFill();
                rect(i*w,j*h,w,h);
                board[i][j].drawTurn();
            }
        }
         checkWin();
        System.out.println(winner + "no");
        if(winner!=-1){
            background(0);
        }
    }
    public void mousePressed() {
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                totalTurns=board[i][j].onClick(mouseX,mouseY,totalTurns);
            }
        }
    }
    public void checkWin() {
        //8 wincons:
        // 3x horizontals
        // 3x verticals
        // 2x diagonals
        for (int i = 0; i < 3; i++) {
            if (board[i][0].state == board[i][1].state && board[i][0].state == board[i][2].state && board[i][0].state !=-1) {
                winner = totalTurns % 2;
                System.out.println("hello");
            } else if (board[0][i].state == board[1][i].state && board[0][i].state == board[2][i].state && board[0][i].state !=-1) {
                winner = totalTurns % 2;
            } else if(board[0][0].state==board[1][1].state && board[0][0].state==board[2][2].state && board[0][0].state !=-1){
                winner=totalTurns%2;
            }else if(board[0][2].state==board[1][1].state && board[0][2].state==board[2][0].state && board[0][2].state !=-1){
                winner=totalTurns%2;
            }

        }
    }
    class GridSquare{
        public float x;
        public float y;
        public float w;
        public float h;
        public int state;
        public GridSquare(float tempX, float tempY, float tempW, float tempH)  {
            x = tempX;
            y = tempY;
            w = tempW;
            h = tempH;
            state = -1;
        }
        public void drawTurn(){
            if(state==0){
                ellipse(x+w/2,y+h/2,w,h);
            }
            if(state==1){
                line(x,y,x+w,y+h);
                line(x+w,y,x,y+h);
            }
        }
        int onClick(int clickedX, int clickedY, int turns){
            if(clickedX>x && clickedX<x+w && clickedY>y && clickedY<y+h && ((state!=1 )&& (state!=0))){
                 state=turns%2;
                    return turns+1;
            }
            return turns;
        }
    }
}
