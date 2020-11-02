package Probe;

import java.util.ArrayList;
import java.util.List;

import Location.CardinalPoints;

public class Probe {
	
	private int axis_x;
	private int axis_y;
	private CardinalPoints orientation;

	public Probe(int axis_x, int axis_y, CardinalPoints orientation) {
		this.axis_x = axis_x;
		this.axis_y = axis_y;
		this.orientation = orientation;
	}

	public int getAxis_x() {
		return axis_x;
	}

	public void setAxis_x(int axis_x) {
		this.axis_x = axis_x;
	}

	public int getAxis_y() {
		return axis_y;
	}

	public void setAxis_y(int axis_y) {
		this.axis_y = axis_y;
	}

	public CardinalPoints getOrientation() {
		return orientation;
	}

	public void setOrientation(CardinalPoints orientation) {
		this.orientation = orientation;
	}
	
}
