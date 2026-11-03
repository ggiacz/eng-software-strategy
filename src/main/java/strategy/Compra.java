package strategy;

public class Compra {

    private Pagamento pagamento;

    public Compra(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public double calcularPagamento(double valor) {
        return pagamento.calcular(valor);
    }
}
