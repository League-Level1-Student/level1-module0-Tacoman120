package _01_methods._5_FlappyBird;

import processing.core.PApplet;
import processing.core.PImage;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    PImage back;
    PImage pipeBottom;
    PImage pipeTop;
    PImage bird;
    int x = 300;
    int y = 300;
    int birdYVelocity = -10;
    int gravity = 1;
    int pipeMove = 550;
    int upperPipeHeight = 100;
    int pipeGap = 505;
    int lowerY = 0;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
        
    }
   
    @Override
    public void setup() {
    	back = loadImage("flappyBackground.jpg");
        pipeBottom = loadImage("bottomPipe.png");
        pipeTop = loadImage("topPipe.png");
        bird = loadImage("bird.png");
        bird.resize(50,50);
        back.resize(800,600);
        pipeTop.resize(50, upperPipeHeight);
        pipeBottom.resize(50, lowerY);
    }

    @Override
    public void draw() {
    	pipeTop.resize(50, upperPipeHeight);
        pipeBottom.resize(50, lowerY);
    	lowerY = upperPipeHeight + pipeGap;
    	 background(back);
         image (pipeBottom,pipeMove,500);
         image (pipeTop,pipeMove, 0);
         image (bird, x, y);
        if(mousePressed) {
        	mousepressed();
        }
        pipeMove--;
        y+=gravity;
        if(pipeMove==-50) {
        	 teleportPipes();
         }
       
         
    }
    
    void mousepressed() {
    	y += birdYVelocity; 
    }
    void teleportPipes() {
    	pipeMove=850;
    	 upperPipeHeight = (int) random(100, 400);
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
