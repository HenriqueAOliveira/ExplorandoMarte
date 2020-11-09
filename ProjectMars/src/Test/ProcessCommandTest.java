package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Location.CardinalPoints;
import Probe.Probe;
import Processor.Commands;
import Processor.Processor;
import junit.framework.TestCase;

public class ProcessCommandTest {
	
	@Test
	public void processCommandWithCommandToRightTest() {
		Probe probeTest = new Probe(1, 2, CardinalPoints.N);
		Processor.processCommand(probeTest, 1, 2, CardinalPoints.N, Commands.R);
		assertEquals(1, probeTest.getAxis_x());
		assertEquals(2, probeTest.getAxis_y());
		assertEquals(CardinalPoints.E, probeTest.getOrientation());
	}
	
	@Test
	public void processCommandWithCommandLeftTest() {
		Probe probeTest = new Probe(4, 5, CardinalPoints.W);
		Processor.processCommand(probeTest, 4, 5, CardinalPoints.W, Commands.L);
		assertEquals(4, probeTest.getAxis_x());
		assertEquals(5, probeTest.getAxis_y());
		assertEquals(CardinalPoints.S, probeTest.getOrientation());
	}
	
	@Test
	public void processCommandWithCommandMoveForwardInNorthTest() {
		Probe probeTest = new Probe(3, 4, CardinalPoints.N);
		Processor.processCommand(probeTest, 3, 4, CardinalPoints.N, Commands.M);
		assertEquals(3, probeTest.getAxis_x());
		assertEquals(5, probeTest.getAxis_y());
		assertEquals(CardinalPoints.N, probeTest.getOrientation());
	}
	
	@Test
	public void processCommandWithCommandMoveForwardInEastTest() {
		Probe probeTest = new Probe(2, 3, CardinalPoints.E);
		Processor.processCommand(probeTest, 2, 3, CardinalPoints.E, Commands.M);
		assertEquals(3, probeTest.getAxis_x());
		assertEquals(3, probeTest.getAxis_y());
		assertEquals(CardinalPoints.E, probeTest.getOrientation());
	}
	
	@Test
	public void processCommandWithCommandMoveForwardInSouthTest() {
		Probe probeTest = new Probe(4, 4, CardinalPoints.S);
		Processor.processCommand(probeTest, 4, 4, CardinalPoints.S, Commands.M);
		assertEquals(4, probeTest.getAxis_x());
		assertEquals(3, probeTest.getAxis_y());
		assertEquals(CardinalPoints.S, probeTest.getOrientation());
	}
	
	@Test
	public void processCommandWithCommandMoveForwardInWestTest() {
		Probe probeTest = new Probe(1, 5, CardinalPoints.W);
		Processor.processCommand(probeTest, 1, 5, CardinalPoints.W, Commands.M);
		assertEquals(0, probeTest.getAxis_x());
		assertEquals(5, probeTest.getAxis_y());
		assertEquals(CardinalPoints.W, probeTest.getOrientation());
	}
	
	@Test
	public void processCommandWithCommandMoveForwardLimitInXTest() {
		Probe probeTest = new Probe(5, 5, CardinalPoints.E);
		Processor.processCommand(probeTest, 5, 5, CardinalPoints.E, Commands.M);
		assertEquals(5, probeTest.getAxis_x());
		assertEquals(5, probeTest.getAxis_y());
		assertEquals(CardinalPoints.E, probeTest.getOrientation());
	}

	@Test
	public void processCommandWithCommandMoveForwardLimitInYTest() {
		Probe probeTest = new Probe(2, 5, CardinalPoints.N);
		Processor.processCommand(probeTest, 2, 5, CardinalPoints.N, Commands.M);
		assertEquals(2, probeTest.getAxis_x());
		assertEquals(5, probeTest.getAxis_y());
		assertEquals(CardinalPoints.N, probeTest.getOrientation());
	}
	
}
