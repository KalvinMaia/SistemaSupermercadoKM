package supermercadoKM;

public class ProdutoEletronico extends Produto {
    private int mesesGarantia;

    public ProdutoEletronico(String nome, int codigoBarras, double precoBase,
                              Fornecedor fornecedor, int mesesGarantia) {
        super(nome, codigoBarras, precoBase, fornecedor);
        this.mesesGarantia = mesesGarantia;
    }

    @Override
    public double calcularPrecoFinal() {
        double precoFinal = precoBase * 1.50;

        if (mesesGarantia > 12) {
            precoFinal *= 1.15;
        }

        return precoFinal;
    }
}