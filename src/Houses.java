import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rob = new Robot();
	public static void main(String[] args) {
		Houses hs = new Houses();
		rob.setWindowSize(800, 550);
		rob.setX(50);
		rob.setY(530);
		rob.penDown();
		rob.setSpeed(50);
		for (int i = 1; i < 11; i++) {
			Random rand = new Random();
			int size = rand.nextInt(3);
			String height;
			Color color;
			color = new Color(5,100,0);
			if(size==0) {
				height = "small";
			}
			else if(size==1) {
				height = "medium";
			}
			else {
				height = "large";
			}
			
			hs.drawHouse(height, color);
			
		} 
	}
	
	void drawHouse(String height, Color color) {
		int h = 0;
		if (height.equals("large")) {
			h=250;

			rob.move(h);
			rob.turn(90);
			drawFlatRoof(height, color);
		
		}
		else if(height.equals("medium")) {
			h=120;
			
			rob.move(h);
			drawPointyRoof(height, color);
			
		}
		else if(height.equals("small")) {
			h=60;
			
			rob.move(h);
			drawPointyRoof(height, color);
			
		}
		rob.turn(90);
		rob.move(h);
		rob.turn(-90);
		rob.move(20);
		rob.turn(-90);
	}
	void drawFlatRoof(String height, Color color) { 
		rob.setPenColor(color);
		rob.move(20);
		
	}
	void drawPointyRoof(String height, Color color) {
		rob.setPenColor(color);
		rob.turn(45);
		rob.move(10);
		rob.turn(-90);
		rob.move(-10);
		rob.turn(45);
		rob.turn(90);
		
	}
}
