import org.example.BancoDados;
import org.example.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultarDadosPessoaTest {


    //BeforeAll tradução, "antes de tudo"
    @BeforeAll
    static void configurarConexao() {
        BancoDados.iniciarConexao();

    }
    //BeforeEach tradução, "antes de cada"
    @BeforeEach
    void inserirDadosPessoaTest() {
        BancoDados.inserirDados(new Pessoa("João", LocalDate.of(2002,1,20)));
    }

    // AfterEach tradução, "depois de cada"
    @AfterEach
    void removerDadosPessoaTest() {
        BancoDados.removerDados(new Pessoa("João", LocalDate.of(2002,1,20)));
    }

    @Test
    void validarDadosRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosRetorno2() {
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDados.fecharConexao();
    }
}
