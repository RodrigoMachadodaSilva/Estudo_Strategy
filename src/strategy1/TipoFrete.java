package strategy1;

public enum TipoFrete {
	
	NORMAL {
		@Override
		public Frete obterFrete() {
			return new FreteNormal();
		}
	},
	
	SEDEX {
		@Override
		public Frete obterFrete() {
			return new FreteSedex();
		}
	};
	
	public abstract Frete obterFrete();

}
