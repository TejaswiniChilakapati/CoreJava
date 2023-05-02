//3.Write a Java program to implement a simple traffic light simulation using enums.

package day4;

import java.lang.reflect.Array;

public class TrafficLightStimulation {

	enum TrafficLightColour{
		
		RED,YELLOW,GREEN;
	}
	
	public static void main(String []args) throws InterruptedException {
		TrafficLightColour Colour= TrafficLightColour.RED;
		
		
		while(true) {
			switch(Colour) {
			case RED:
				System.out.println("STOP!");
				Thread.sleep(4000);
				Colour=TrafficLightColour.YELLOW;
				break;
			case YELLOW:
				System.out.println("Caution!");
				Thread.sleep(3000);
				Colour=TrafficLightColour.GREEN;
				break;
			case GREEN:
				System.out.println("GO!");
				Thread.sleep(2000);
				Colour=TrafficLightColour.RED;
				break;
				
				
			
		}
	}
}
}