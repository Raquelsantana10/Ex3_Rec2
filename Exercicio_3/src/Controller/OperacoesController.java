package Controller;

public class OperacoesController {
	
	public double somatoria(double N) {
		//Condição de Parada: Quando o valor informado chegar á zero.
		if (N == 0) {
			return 1;
		} else {
			return 1 / N + somatoria (N - 1);//Retorna a soma da divisão, diminuindo em 1 o valor de N.
		}
	}
}
