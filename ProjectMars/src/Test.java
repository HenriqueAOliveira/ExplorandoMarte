import Location.CardinalPoints;
import Processor.Commands;
import Processor.Processor;

public class Test {

	public static void main(String[] args) {
		int x = 1; 
		int y = 2; 
//		CardinalPoints orientation = CardinalPoints.N; 
//		Commands command = Commands.L;
		
		String direction = "N"; String command2 = "M";
		CardinalPoints orientation = CardinalPoints.valueOf(direction);
		Commands command = Commands.valueOf(command2);
		
		Processor controller = new Processor();
		controller.processCommand(x, y, orientation, command);
		System.out.println(controller.getPosProcessing_x() + " " 
		+ controller.getPosProcessing_y() + " " + controller.getPosProcessing_orient());
	}
}
