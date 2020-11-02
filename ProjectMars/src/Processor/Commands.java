package Processor;

/**
 * R: comando para girar a Sonda em 90 graus para direita 
 * L: comando para girar a Sonda em 90 graus para esquerda
 * M: comando para avançar um ponto no plano
 */

public enum Commands {
	R("R"),
	L("L"),
	M("M");
	
	private String command;
	
	Commands(String command){
		this.command = command;
	}
	
	public String getCommand() {
		return this.command;
	}
}
