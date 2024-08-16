import org.example.Pessoa;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AssertionsTeste {

    @Test
    void validarLacamento() {
        int[] primeiroLacamento = {10,20,30,40,50};
        int[] segundoLacamento = {10,20,30,40,50};

        // Valida se os valores dentro dos arrays são iguais
        assertArrayEquals(primeiroLacamento, segundoLacamento);

    }

    @Test
    void validarObjetoEstaNull() {
        Pessoa pessoa = null;

        // Validar se Objeto Pessoa esta com o valor Null
        assertNull(pessoa);

        pessoa = new Pessoa("Lucas", LocalDate.now());

        // Valida se o Objeto não esta com o valor Null
        // Nesse caso não esta pois atribui uma instacia de pessoa no objeto
        assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes() {
        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }

}
