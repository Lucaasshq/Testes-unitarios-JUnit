import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
     void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("jessica", LocalDate.of(2000, 1, 15));
        Assertions.assertEquals(24, jessica.getIDade());

    }

    @Test
    void deveRetornarEMaiorIdade() {
        Pessoa lucas = new Pessoa("Lucas", LocalDate.of(2004, 1, 26));
        Assertions.assertTrue(lucas.eMaiorIdade());

        Pessoa joao = new Pessoa("joao", LocalDate.now());
        Assertions.assertFalse(joao.eMaiorIdade());
    }
}
