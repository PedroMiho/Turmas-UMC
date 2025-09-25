package entidades;

public class PagamentoBoleto extends Pagamento{
    //Atributos
    private String codigoBarras;

    public PagamentoBoleto(String nomeCliente, double valorPagamento, String dataPagamento, String codigoBarras) {
        super(nomeCliente, valorPagamento, dataPagamento);
        this.codigoBarras = codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    @Override
    public String toString() {
        return "NomeCliente: " + getNomeCliente() +
                " | Valor do Pagamento: " + getValorPagamento() +
                " | Data Pagamento: " + getValorPagamento() +
                " | Código de Barras: " + codigoBarras
                ;
    }
}
