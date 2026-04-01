package supermercadoKM;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Produto> itens;

    public CarrinhoDeCompras() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto) {
        itens.add(produto);
    }

    public void processarCompra() {
        float total = 0;

        System.out.println("===== TALÃO DE COMPRA =====");

        for (Produto p : itens) {
            p.exibirResumo();
            double precoFinal = p.calcularPrecoFinal();
            System.out.println("Preço final: R$ " + precoFinal);
            System.out.println("--------------------------");
            total += precoFinal;
        }

        System.out.println("TOTAL A PAGAR: R$ " + total);
    }
}