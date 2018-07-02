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
	void drawHouse(String height, String color) { 
		int h = 0;
		if(height.equals("small")) {
			h=60;
		}
		else if(height.equals("medium")) {
			h=120;
		}
		else if(height.equals("large")) {
			h=250;
		}
		rob.move(h);
		rob.turn(90);
		rob.move(20);
		rob.turn(90);
		rob.move(h);
		rob.turn(-90);
		rob.setPenColor(Color.GREEN);
		rob.move(20);
		rob.turn(-90);
	}
}
