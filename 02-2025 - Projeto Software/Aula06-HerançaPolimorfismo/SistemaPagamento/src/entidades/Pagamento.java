package entidades;

public abstract  class Pagamento {
    String nomeCliente;
    private double valorPagamento;
    private String dataPagamento;

    //Construtores
    public Pagamento(String nomeCliente, double valorPagamento, String dataPagamento) {
        this.nomeCliente = nomeCliente;
        this.valorPagamento = valorPagamento;
        this.dataPagamento = dataPagamento;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "\nNomeCliente: " + nomeCliente +
                "\nValor do Pagamento: " + valorPagamento +
                "\nData Pagamento: " + dataPagamento;
    }
}
