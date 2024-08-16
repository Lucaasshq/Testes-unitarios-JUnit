import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTest {

    @Test
    //Executa esse teste apenas se estiver em um Systema WINDOWS ou LINUX
    @EnabledOnOs({OS.WINDOWS, OS.LINUX})
    void validarAlgoSomenteNoUsuarioLucas() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
