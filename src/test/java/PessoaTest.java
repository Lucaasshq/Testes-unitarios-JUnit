import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
     void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Lucas", LocalDate.of(2000, 1, 15));
        Assertions.assertEquals(24, jessica.getIDade());

    }
}
