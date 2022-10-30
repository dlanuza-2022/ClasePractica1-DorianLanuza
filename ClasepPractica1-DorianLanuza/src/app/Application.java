package app;

import tools.FifthTool;
import tools.FirstTool;
import tools.FourthTool;
import tools.SecondTool;
import tools.ThirdTool;

public class Application {
	
	static FirstTool toolOne = new FirstTool();
	static SecondTool toolTwo = new SecondTool();
	static ThirdTool toolThree = new ThirdTool();
	static FourthTool toolFour = new FourthTool();
	static FifthTool toolFive = new FifthTool();
	
	
	//Primer herramienta
	static public void toolOne() {
		toolOne.function();
		toolOne.result();
	}
	
	
	//Segunda herramienta
	static public void toolTwo() {
		toolTwo.function();
		toolTwo.result();
	}
	
	//Tercera herramienta
	static public void sum() {
		toolThree.sum();
	}
	
	static public void substraction() {
		toolThree.substraction();
	}
	
	static public void multiplication() {
		toolThree.multiplication();
	}
	
	static public void division() {
		toolThree.division();
	}
	
	//Cuarta herramienta
	static public void toolFour() {
		toolFour.function();
		toolFour.result();
	}
	
	
	//Quinta herramienta
	
	static public void toolFive() {
		toolFive.function();
		toolFive.result();
	}
	
	

}
