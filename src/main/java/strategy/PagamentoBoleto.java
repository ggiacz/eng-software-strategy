package strategy;

public class PagamentoBoleto implements Pagamento {

    @Override
    public double calcular(double valor) {
        return valor;
    }
}
