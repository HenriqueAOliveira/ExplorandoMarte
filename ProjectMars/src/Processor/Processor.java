package Processor;

import java.util.HashMap;
import java.util.Map;

import Location.CardinalPoints;

public class Processor {
	
	private int posProcessing_x;
	private int posProcessing_y;
	private String posProcessing_orient;
/**
 * Inverter a orientação da sonda quando receber um L ou R como comando
 */
	
	public void changeOrientation(CardinalPoints orientation, 
			Commands command) {
		
		if(command == Commands.L) {
			orientation = turnToLeft(orientation);
		} else {
			orientation = turnToRight(orientation);
		}
		System.out.println("A nova orientação e: "+ orientation);
		//setPosProcessing_orient(orientation);
	}

/**
 * Processamento do comando e, em caso de L e R, alterar orientacao da sonda	
 */
	
	public void processCommand(int axis_x, int axis_y, CardinalPoints orientation, 
			Commands command) {
		
		System.out.println("A orientacao e o comando e, respectivamente,  "+
		orientation + " e "+ command);
		
		if(command == Commands.M) {
			moveForward(axis_x, axis_y, orientation);
		} else {
			changeOrientation(orientation,command);
		}		
	}
	
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
		setPosProcessing_x(axis_x);
		setPosProcessing_y(axis_y);
	}
	
	
	
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

	public int getPosProcessing_x() {
		return posProcessing_x;
	}

	public void setPosProcessing_x(int posProcessing_x) {
		this.posProcessing_x = posProcessing_x;
	}

	public int getPosProcessing_y() {
		return posProcessing_y;
	}

	public void setPosProcessing_y(int posProcessing_y) {
		this.posProcessing_y = posProcessing_y;
	}

	public String getPosProcessing_orient() {
		return posProcessing_orient;
	}

	public void setPosProcessing_orient(String posProcessing_orient) {
		this.posProcessing_orient = posProcessing_orient;
	}
	
	
	
}
