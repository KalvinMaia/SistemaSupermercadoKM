package supermercadoKM;

public class Fornecedor {
    private String nomeEmpresa;
    private String nif;
    private String paisOrigem;

    public Fornecedor(String nomeEmpresa, String nif, String paisOrigem) {
        this.nomeEmpresa = nomeEmpresa;
        this.nif = nif;
        this.paisOrigem = paisOrigem;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public void exibirDetalhesFornecedor() {
        System.out.println("Fornecedor: " + nomeEmpresa);
        System.out.println("NIF: " + nif);
        System.out.println("País: " + paisOrigem);
    }
}