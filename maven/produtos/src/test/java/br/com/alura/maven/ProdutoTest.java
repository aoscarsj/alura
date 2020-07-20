package br.com.alura.maven;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProdutoTest {

    @Test
    public void verificaPrecoComImposto() {
        Produto bala = new Produto("Juquinha", 0.1);

        assertEquals(0.11, bala.getPrecoComImposto(), 0.00001);
    }
}
