package supermercadoKM;

public class Main {
    public static void main(String[] args) {

        // Fornecedores
        Fornecedor f1 = new Fornecedor("Fazenda Local", "123456", "Brasil");
        Fornecedor f2 = new Fornecedor("TechGlobal", "987654", "EUA");

        // Produtos
        Produto p1 = new ProdutoAlimenticio("Leite", 111, 15.00, f1, 3);
        Produto p2 = new ProdutoEletronico("Notebook", 222, 3000.00, f2, 24);

        // Carrinho
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem(p1);
        carrinho.adicionarItem(p2);

        // Processar compra
        carrinho.processarCompra();
    }
}