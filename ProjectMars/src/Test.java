import java.util.Scanner;

import Location.*;
import Probe.Probe;
import Processor.*;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String coordinate = scanner.nextLine();

		int coord_x = Integer.parseInt(String.valueOf(coordinate.charAt(0)));
		int coord_y = Integer.parseInt(String.valueOf(coordinate.charAt(1)));
		CardinalPoints coord_direct = 
				CardinalPoints.valueOf(String.valueOf(coordinate.charAt(2)));	
		}

}
