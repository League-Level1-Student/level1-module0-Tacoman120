package _01_methods._1_houses;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	Robot rob = new Robot();
		
	public void run() {
		// Check the recipe to find out what code to put here
		rob.moveTo(30, 450);
		rob.setSpeed(99);
		rob.penDown();
		for(int i = 100; i < 500; i+=40) {
			String paint = JOptionPane.showInputDialog(null, "What color do you want the houses to be? (Chose from red, orange, yellow, green, blue, and purple )");
			String bob = JOptionPane.showInputDialog(null, "What size house do you want? (Chose from small, medium or large)");
		drawHouse(bob, paint);
		}
		
	}
	 void drawHouse (String height, String color) {
		 int bobb = 0;
		 int small = 60;
		 int medium = 120;
		 int large = 250;
		 if(height.equalsIgnoreCase("small")) {
			 bobb = small; 
		 }else if(height.equalsIgnoreCase("medium")) {
			 bobb = medium;
		 }else if(height.equalsIgnoreCase("large")) {
			 bobb = large;
		 }
		 if(color.equalsIgnoreCase("red")) {
			 rob.setPenColor(200, 0, 0);
		 } if(color.equalsIgnoreCase("orange")) {
			  rob.setPenColor(255, 69, 0);
		 }else if(color.equalsIgnoreCase("yellow")) {
			 rob.setPenColor(255, 255, 0);
		 }else if(color.equalsIgnoreCase("green")) {
		rob.setPenColor(0, 255, 0);	 
		 }else if(color.equalsIgnoreCase("blue")) {
			 rob.setPenColor(0, 0, 255);
		 }else if(color.equalsIgnoreCase("purple")) {
			 rob.setPenColor(106, 13, 173);
		 }
			 
	 
		rob.move(bobb);
		if(bobb==large) {
			rob.turn(90);
			rob.move(50);
			rob.turn(90);
		}else if (bobb==small){
			rob.turn(45);
			rob.move(30);
			rob.turn(90);
			rob.move(30);
			rob.turn(45);
		} else if (bobb==medium) {
			rob.turn(45);
			rob.move(30);
			rob.turn(90);
			rob.move(30);
			rob.turn(45);
		}
		rob.move(bobb);
		rob.turn(-90);
		rob.setPenColor(0,200,0);
		rob.move(40);
		rob.turn(-90);
		rob.setPenColor(0,0,0);
		
	}
}
