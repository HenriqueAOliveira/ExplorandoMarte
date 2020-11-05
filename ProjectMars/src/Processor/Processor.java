package Processor;

import java.util.HashMap;
import java.util.Map;
import Probe.Probe;
import Location.CardinalPoints;

public class Processor {
	
/**
 * Inverter a orientação da sonda quando receber um L ou R como comando
 */
	
	private static CardinalPoints changeOrientation(CardinalPoints orientation, 
			Commands command) {
		
		if(command == Commands.L) {
			orientation = turnToLeft(orientation);
		} else if(command == Commands.R){
			orientation = turnToRight(orientation);
		}

		return orientation;
	}

/**
 * Processamento do comando e, em caso de L e R, alterar orientacao da sonda	
 */
	
	public static void processCommand(Probe probe, int axis_x, int axis_y, CardinalPoints orientation, 
			Commands command) {
		
		if(command == Commands.M) {
			probe.setAxis_x(moveForward_x(axis_x, orientation));
			probe.setAxis_y(moveForward_y(axis_y, orientation));
		} else {
			probe.setOrientation(changeOrientation(orientation,command));
		}		
	}		
	
	private static int moveForward_x(int axis_x, CardinalPoints orientation){
 		switch(orientation) {
			case W:
				axis_x -= 1;
				break;
			
			case E:
				axis_x += 1;
				break; 		
 		}
 // Tratamento quando alguma borda e' alcancada. Nesse caso, o valor da borda é setado 		
 		if(axis_x > 5) {
 			axis_x = 5; 
 		} else if(axis_x < 0){
 			axis_x = 0;
 		}
 		
 		return axis_x;
 	}
 	
	private static int moveForward_y(int axis_y, CardinalPoints orientation){
 		switch(orientation) {
			case N:
				axis_y += 1;
				break;
			
			case S:
				axis_y -= 1;
				break;
 		}
// Tratamento quando alguma borda e' alcancada. Nesse caso, o valor da borda é setado 		
 		if(axis_y > 5) {
 			axis_y = 5; 
 		} else if(axis_y < 0){
 			axis_y = 0;
 		}
 		return axis_y;
 	}	
 	
	
	private static CardinalPoints turnToRight(CardinalPoints orientation) {
		Map<CardinalPoints,CardinalPoints> turnToRight = new HashMap<>();
		
		turnToRight.put(CardinalPoints.N, CardinalPoints.E);
		turnToRight.put(CardinalPoints.E, CardinalPoints.S);
		turnToRight.put(CardinalPoints.S, CardinalPoints.W);
		turnToRight.put(CardinalPoints.W, CardinalPoints.N);
		
		return turnToRight.get(orientation);
	}
	
	private static CardinalPoints turnToLeft(CardinalPoints orientation) {
		Map<CardinalPoints,CardinalPoints> turnToLeft = new HashMap<>();
		
		turnToLeft.put(CardinalPoints.N, CardinalPoints.W);
		turnToLeft.put(CardinalPoints.W, CardinalPoints.S);
		turnToLeft.put(CardinalPoints.S, CardinalPoints.E);
		turnToLeft.put(CardinalPoints.E, CardinalPoints.N);
		
		return turnToLeft.get(orientation);
	}
		
}
