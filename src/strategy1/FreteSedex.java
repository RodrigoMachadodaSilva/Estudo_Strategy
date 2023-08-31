package strategy1;

public class FreteSedex implements Frete {

	public double calcularPreco(int distancia) {
		return distancia + 1.45 + 12;
	}

}
