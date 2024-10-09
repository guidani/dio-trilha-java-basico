import br.com.digitalinnovationone.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarCalculoDeIdade(){
        Pessoa pessoa = new Pessoa("gui", LocalDate.of(1996, 6, 15));
        Assertions.assertEquals(28, pessoa.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa pessoa = new Pessoa("gui", LocalDate.of(1996, 6, 15));
        Assertions.assertTrue(pessoa.ehMaiorDeIdade());

        Pessoa pessoa2 = new Pessoa("dani", LocalDate.now());
        Assertions.assertFalse(pessoa2.ehMaiorDeIdade());
    }
}
