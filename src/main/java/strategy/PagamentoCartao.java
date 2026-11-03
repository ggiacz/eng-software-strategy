package strategy;

public class PagamentoCartao implements Pagamento {

    @Override
    public double calcular(double valor) {
        return valor * 1.05;
    }
}
