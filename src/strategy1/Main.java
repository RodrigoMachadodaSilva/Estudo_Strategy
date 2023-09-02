package strategy1;

public class Main {
	
	public static void main(String[] args) {
	
	int distancia = 100;
	
	int opcaoFrete = 0;
	
	TipoFrete tipoFrete = TipoFrete.values() [opcaoFrete];
	
	Frete frete = tipoFrete.obterFrete();
	double preco = frete.calcularPreco(distancia);
	System.out.print(preco);

	}

}
