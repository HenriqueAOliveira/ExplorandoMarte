import Controller.Commands;
import Location.CardinalPoints;
import Controller.Controller;

public class Test {

	public static void main(String[] args) {
		int x = 1; 
		int y = 2; 
		CardinalPoints orientation = CardinalPoints.N; 
		Commands command = Commands.L;
		
		Controller controller = new Controller();
		controller.processCommand(x, y, orientation, command);
	}
}
