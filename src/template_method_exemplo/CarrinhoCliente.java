package template_method_exemplo;

public class CarrinhoCliente  extends CarrinhoTemplate {
	boolean euNaoGostoDesseCara;

	@Override
	int getAcrescimoPct() {
		if(euNaoGostoDesseCara) {
			return 10;
		}
		return 0;
	}
	@Override
	int getDescontoPct() {
		int qtdProdutos = 0;
		for(Item item: itens) {
			qtdProdutos += item.quantidade;
		}
		if(qtdProdutos >= 100) {
			return 5;
		}
		return 0;
	}
}