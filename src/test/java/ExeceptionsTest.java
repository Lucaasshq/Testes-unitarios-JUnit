import org.example.Conta;
import org.example.TransferenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExeceptionsTest {

    @Test
    void validarCenarioExecaoNaTransferencia() {
        Conta contaOrigem = new Conta("12345678", 0);
        Conta contaDestino = new Conta("987654321", 100);

        TransferenciaEntreContas transferencia = new TransferenciaEntreContas();

        //Valida se uma execeção vai ser lançada
        //no caso desse teste vai falhar pois vai lançar uma execeptios
        Assertions.assertDoesNotThrow(() ->
                transferencia.transferir(contaOrigem, contaDestino, 20));
    }
}
