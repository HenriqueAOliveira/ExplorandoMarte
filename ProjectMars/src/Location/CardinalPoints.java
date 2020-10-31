package Location;
/**
 * N = NORTE
 * S = SUL
 * E = LESTE
 * W = OESTE
 */
public enum CardinalPoints {
	N("N"),
	S("S"),
	E("E"),
	W("W");
	
	private String orientation;
	
	CardinalPoints(String orientation){
		this.orientation = orientation;
	}
}
