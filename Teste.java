import java.util.ArrayList;

public class Teste{
	public static void main(String[] args) {
		CarrinhoCompras carrinho = new CarrinhoCompras();
		ArrayList <Item> itens = new ArrayList <Item>();

		carrinho.incluiItem(itens, "49,99", "25/05/2017", "LG", "Fone", "I1");
		carrinho.incluiItem(itens, "149,99", "25/05/2017", "Levi's", "Calça", "I2");
		carrinho.incluiItem(itens, "139,99", "25/05/2017", "Bosch", "Bateria moto", "I3");
		int tam = itens.size();

		for(int i = 0; i < tam; i++)
			System.out.println(itens.get(i).id);

		carrinho.excluiItem(itens, "I2");
		System.out.println("\n\n");

		for(int i = 0; i < tam; i++)
			System.out.println(itens.get(i).id);

	}
}