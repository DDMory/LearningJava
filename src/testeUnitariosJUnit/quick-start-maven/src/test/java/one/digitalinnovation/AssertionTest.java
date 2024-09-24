package one.digitalinnovation;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class AssertionTest {

    @Test
    public void validarLancamento(){
        int[] primeiroLancamento = {12,20,32,12,54};
        int[] segundoLancamento = {12,20,32,12,54};

        Assert.assertArrayEquals(primeiroLancamento,segundoLancamento);
    }

    @Test
    public void validarSeObjetoEstaNulo(){
        Pessoa pessoa = new Pessoa("Luca", LocalDateTime.of(2021,12,31,12,3));
        Assert.assertNotNull(pessoa);
    }

    @Test
    public void validarNumerosDeTiposDiferentes(){
        double valor = 5.2d;
        double outroValor = 5.2d;

        Assert.assertEquals(valor,outroValor, 0.0d);
    }
}
