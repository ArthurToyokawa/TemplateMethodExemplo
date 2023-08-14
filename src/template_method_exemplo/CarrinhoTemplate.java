package template_method_exemplo;

abstract class CarrinhoTemplate {
	
	Item[] itens;
	//metodos utilizados no metodo template
	abstract int getDescontoPct();
	abstract int getAcrescimoPct();
	
	//metodo template
	public double calcularTotal() {
		double descontoPct = getDescontoPct();
		double acrescimoPct  = getAcrescimoPct();

		double total = 0;
		for(Item item: itens) {
			total += item.valor * item.quantidade;
		}		
		System.out.println("desconto: " + descontoPct);
		System.out.println("acrescimo: " + acrescimoPct);
		return total * ((acrescimoPct - descontoPct) / 100.0 + 1);
	}
}