package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosDeCadastro(){
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("MG", "Patis de Minas", "RUA 32", "CASA", "Centro Metropolitano");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("12345678")).thenReturn(dadosLocalizacao);
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Jose","02212326898", LocalDate.now(), "12345678" );

        Assertions.assertEquals("Jose", pessoa.getNome());
        Assertions.assertEquals("02212326898", pessoa.getDocumento());
        Assertions.assertEquals("MG", pessoa.getEndereco().getUf());
        Assertions.assertEquals("CASA", pessoa.getEndereco().getComplemento());
    }
}
