package Controller;

public class OperacoesController {
	
	public double somatoria(double N) {
		//Condi��o de Parada: Quando o valor informado chegar � zero.
		if (N == 0) {
			return 1;
		} else {
			return 1 / N + somatoria (N - 1);//Retorna a soma da divis�o, diminuindo em 1 o valor de N.
		}
	}
}
