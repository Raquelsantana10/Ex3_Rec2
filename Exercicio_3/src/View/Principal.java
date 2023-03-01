package View;

import Controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		
		OperacoesController Op = new OperacoesController();
		
		double N = 3;
		
		System.out.println(Op.somatoria(N));

	}

}
