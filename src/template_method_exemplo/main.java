package template_method_exemplo;

public class main {
	public static void main(String[] args) {
		
		Item itemCli = new Item();
		itemCli.quantidade = 200;
		itemCli.valor = 1;
		
		CarrinhoCliente carCli = new CarrinhoCliente();
		carCli.euNaoGostoDesseCara = true;
		carCli.itens = new Item[1];
		carCli.itens[0] = itemCli;
		
		System.out.println("cliente:");
		System.out.println("total cliente: " + carCli.calcularTotal());

		Item itemFunc = new Item();
		itemFunc.quantidade = 50;
		itemFunc.valor = 2;
		
		CarrinhoFuncionario cFunc = new CarrinhoFuncionario();
		cFunc.itens = new Item[1];
		cFunc.itens[0] = itemFunc;

		System.out.println("funcionario:");
		System.out.println("total funcionario: " + cFunc.calcularTotal());
	
	}
}
