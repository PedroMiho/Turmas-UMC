package entidades;

public class PagamentoPix extends Pagamento {
    private String chavePix;


    public PagamentoPix(String nomeCliente, double valorPagamento, String dataPagamento, String chavePix) {
        super(nomeCliente, valorPagamento, dataPagamento);
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public String toString() {
        return "NomeCliente: " + getNomeCliente() +
               " | Valor do Pagamento: " + getValorPagamento() +
               " | Data Pagamento: " + getValorPagamento() +
               " | Chave Pix: " + chavePix
                ;
    }
}
