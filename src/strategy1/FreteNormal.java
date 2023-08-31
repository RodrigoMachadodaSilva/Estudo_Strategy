package strategy1;

public class FreteNormal implements Frete {
	
	public double calcularPreco(int distancia) {
		return distancia * 1.25 + 10;
	}

}
