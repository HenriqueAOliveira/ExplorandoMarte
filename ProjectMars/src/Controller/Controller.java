package Controller;

import java.util.HashMap;
import java.util.Map;

import Location.CardinalPoints;

public class Controller {
	
/**
 * Inverter a orientação da sonda quando receber um L ou R como comando
 */
	
	public CardinalPoints changeOrientation(CardinalPoints orientation, 
			Commands command) {
		if(command == Commands.L) {
			orientation = turnToLeft(orientation);
		} else {
			orientation = turnToRight(orientation);
		}
		System.out.println("A nova orientação e: "+ orientation);
		return orientation;
	}

/**
 * Processamento do comando e, em caso de L e R, alterar orientacao da sonda	
 */
	
	public void processCommand(int axis_x, int axis_y, CardinalPoints orientation, 
			Commands command) {
		
		System.out.println("A orientacao e o comando e, respectivamente,  "+
		orientation + " e "+ command);
		
		if(command == Commands.M) {
//			moveForward(axis_x, axis_y, orientation);
		} else {
			changeOrientation(orientation,command);
		}		
	}
/*	
	public void moveForward(int axis_x, int axis_y, CardinalPoints orientation) {
		switch(orientation) {
			case N:
				axis_y += 1;
				break;
			
			case S:
				axis_y -= 1;
				break;
			
			case W:
				axis_x -= 1;
				break;
			
			case E:
				axis_x += 1;
				break;
		}
	}
*/	
	public CardinalPoints turnToRight(CardinalPoints orientation) {
		Map<CardinalPoints,CardinalPoints> turnToRight = new HashMap<>();
		
		turnToRight.put(CardinalPoints.N, CardinalPoints.E);
		turnToRight.put(CardinalPoints.E, CardinalPoints.S);
		turnToRight.put(CardinalPoints.S, CardinalPoints.W);
		turnToRight.put(CardinalPoints.W, CardinalPoints.N);
		
		return turnToRight.get(orientation);
	}
	
	public CardinalPoints turnToLeft(CardinalPoints orientation) {
		Map<CardinalPoints,CardinalPoints> turnToLeft = new HashMap<>();
		
		turnToLeft.put(CardinalPoints.N, CardinalPoints.W);
		turnToLeft.put(CardinalPoints.W, CardinalPoints.S);
		turnToLeft.put(CardinalPoints.S, CardinalPoints.E);
		turnToLeft.put(CardinalPoints.E, CardinalPoints.N);
		
		return turnToLeft.get(orientation);
	}
}
