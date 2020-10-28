package Probe;

public class Probe {
	private int axis_x;
	private int axis_y;
	private char cardinal;

	public Probe(int axis_x, int axis_y, char cardinal) {
		this.axis_x = axis_x;
		this.axis_y = axis_y;
		this.cardinal = cardinal;
	}

	public int getAxis_x() {
		return axis_x;
	}

	public void setAxis_x(int eixoX) {
		this.axis_x = eixoX;
	}

	public int getAxis_y() {
		return axis_y;
	}

	public void setAxis_y(int axis_y) {
		this.axis_y = axis_y;
	}

	public char getCardinal() {
		return cardinal;
	}

	public void setCardinal(char cardinal) {
		this.cardinal = cardinal;
	}

}
