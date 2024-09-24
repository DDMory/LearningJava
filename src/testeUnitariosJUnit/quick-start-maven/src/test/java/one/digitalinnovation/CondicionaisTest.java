package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTest {
    @Test
    @DisabledForJreRange(min = JRE.JAVA_10, max = JRE.JAVA_18)
    void validarAlgoSomenteNoUsuarioWill(){
        Assertions.assertEquals(10, 5+5);
    }
}
