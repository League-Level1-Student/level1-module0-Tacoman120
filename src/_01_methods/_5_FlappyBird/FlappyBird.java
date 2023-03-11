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
    double gravity = 1;
    int pipeMove = 600;
    int upperPipeHeight = 250;
    int pipeGap = 100;
    int lowerY = 0;
    int score =0;
    int speed = 1;
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
        
       
    }

    @Override
    public void draw() {
    	if(y==600) {
    		System.exit(0);
    	}
    	boolean bob = intersectsPipes();
    	
    	
    	
    	lowerY = upperPipeHeight + pipeGap;
    	System.out.println(bob + "  pipeX: "+ pipeMove + "    x :" + x + "       score: "+ score);
    	pipeTop.resize(50, upperPipeHeight);
        pipeBottom.resize(50, (height - lowerY)+ 10);
    	 background(back);
         image (pipeBottom,pipeMove,lowerY);
         image (pipeTop,pipeMove, 0);
         image (bird, x, y);
         text("Score: "+score, 40, 40);
         if(bob==true) {
        	 System.exit(0);
         }
        if(mousePressed) {
        	mousepressed();
        	gravity=1;
        }else {
        	gravity+=0.1;
        }
        pipeMove-=speed;
        y+=gravity;
        if(pipeMove<= -50) {
        	speed++;
        	 teleportPipes();
         		score++;
         }
       
         
    }
    
    void mousepressed() {
    	y += birdYVelocity; 
    }
    void teleportPipes() {
    	pipeMove=850;
    	 upperPipeHeight = (int) random(100, 400);
    }
    boolean intersectsPipes() { 
        if (y < upperPipeHeight && x > pipeMove && x < (pipeMove+50)){
           return true; }
       else if (y>lowerY && x > pipeMove && x < (pipeMove+50)) {
           return true; }
       else { return false; }
}

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
