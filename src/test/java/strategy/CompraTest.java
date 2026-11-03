package strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompraTest {

    @Test
    void deveCalcularPagamentoPix() {
        Compra compra = new Compra(new PagamentoPix());

        assertEquals(
                95.0,
                compra.calcularPagamento(100.0),
                0.01
        );
    }

    @Test
    void deveCalcularPagamentoCartao() {
        Compra compra = new Compra(new PagamentoCartao());

        assertEquals(
                105.0,
                compra.calcularPagamento(100.0),
                0.01
        );
    }

    @Test
    void deveCalcularPagamentoBoleto() {
        Compra compra = new Compra(new PagamentoBoleto());

        assertEquals(
                100.0,
                compra.calcularPagamento(100.0),
                0.01
        );
    }

    @Test
    void deveAlterarEstrategiaDePagamento() {
        Compra compra = new Compra(new PagamentoPix());

        assertEquals(
                95.0,
                compra.calcularPagamento(100.0),
                0.01
        );

        compra.setPagamento(new PagamentoCartao());

        assertEquals(
                105.0,
                compra.calcularPagamento(100.0),
                0.01
        );
    }
}
