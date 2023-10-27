import jdk.jfr.StackTrace;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestKata {

    @Test
    void contextLoads() {
        var stack = new Pilha();
        assertTrue(stack.isEmpty());
    }
}
