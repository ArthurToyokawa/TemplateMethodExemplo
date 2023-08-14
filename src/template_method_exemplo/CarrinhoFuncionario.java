package template_method_exemplo;

public class CarrinhoFuncionario extends CarrinhoTemplate {
	@Override
	int getAcrescimoPct() {
		return 0;
	}
	@Override
	int getDescontoPct() {
		return 5;
	}
}