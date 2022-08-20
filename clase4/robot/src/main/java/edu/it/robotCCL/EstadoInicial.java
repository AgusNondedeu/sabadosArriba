package edu.it.robotCCL;

public class EstadoInicial implements IState {
	public IState execute() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\cursos\\sabadosArriba\\clase4\\robot\\chromedriver.exe");
		
		System.out.println("Estado incial");
		
		return new ConsultaCotizacionLocal();
	}
	
}
