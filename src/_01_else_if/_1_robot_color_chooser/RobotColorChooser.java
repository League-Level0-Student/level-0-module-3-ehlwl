
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) {
		for(int r=0;r<5;r++) {
		Robot rob = new Robot("hi");
		rob.penDown();
		rob.setPenWidth(10);
		rob.setSpeed(500);
		String c = JOptionPane.showInputDialog("what color do you want?");
		if(c.equals("red")) {
		rob.setPenColor(256,0,0);
		  if(c.equals("green")) {
			 rob.setPenColor(0,256,0);
			 if(c.equals("blue")){
					rob.setPenColor(0,0,256);
				}
			 else {
				 rob.setRandomPenColor();
			 }
		 }
		}
		 
		
		
		for(int i=0;i<4;i++) {
		rob.move(100);
		rob.turn(90);
		}
		}
		//1. Create a new Robot
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
