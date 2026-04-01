package supermercadoKM;

public class ProdutoAlimenticio extends Produto {
    private int diasValidade;

    public ProdutoAlimenticio(String nome, int codigoBarras, double precoBase,
                              Fornecedor fornecedor, int diasValidade) {
        super(nome, codigoBarras, precoBase, fornecedor);
        this.diasValidade = diasValidade;
    }

    @Override
    public double calcularPrecoFinal() {
        double precoFinal = precoBase * 1.20;

        if (diasValidade <= 5) {
            precoFinal *= 0.70; // desconto de 30%
        }

        return precoFinal;
    }
}