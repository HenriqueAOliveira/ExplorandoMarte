package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import Location.CardinalPoints;
import Probe.Probe;
import Processor.*;

public class Main {
	public static void main(String[] args) {

		List<Probe> listOfProbes = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
	
		String border = scanner.nextLine();	
		int border_x = Integer.parseInt(String.valueOf(border.charAt(0)));		
		int border_y = Integer.parseInt(String.valueOf(border.charAt(1)));
		
/**
 * Entrada das sondas lançadas no espaco, suas coordenadas e direcoes e o processamento 
 * dos comandos para reorientacao		
 */
		while(scanner.hasNextLine()) {
			String coordinate = scanner.nextLine();
			
			if(Objects.isNull(coordinate) || coordinate.equals("")) {
				break;
			}
			
			int coord_x = Integer.parseInt(String.valueOf(coordinate.charAt(0)));
			int coord_y = Integer.parseInt(String.valueOf(coordinate.charAt(1)));
			CardinalPoints coord_direct = 
					CardinalPoints.valueOf(String.valueOf(coordinate.charAt(2)));
			Probe probe = new Probe(coord_x, coord_y, coord_direct);
			
			String cmdInSequence = scanner.nextLine();
			
			for(int i = 0; i < cmdInSequence.length(); i++) {				
				Commands currentCmd = 
						Commands.valueOf(String.valueOf(cmdInSequence.charAt(i)));
				Processor.processCommand(probe, probe.getAxis_x(), probe.getAxis_y(), 
						probe.getOrientation(), currentCmd);
			}
			
			listOfProbes.add(probe);
		}
		
		for(Probe probe : listOfProbes) {
			System.out.println(probe.getAxis_x() + " " + probe.getAxis_y() + 
					" " + probe.getOrientation());
		}
	}
}
