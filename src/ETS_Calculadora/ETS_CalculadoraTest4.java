package ETS_Calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.junit.jupiter.params.provider.Arguments.of;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ETS_CalculadoraTest4 {

    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3, 4, 5 })
    public void testSuma(int num) {
        ETS_Calculadora calculadora = new ETS_Calculadora(num, num);
        int resultadoEsperado = num * 2;
        assertEquals(resultadoEsperado, calculadora.suma());
    }

    @ParameterizedTest
    @MethodSource("datosParaTestResta")
    public void testResta(int a, int b, int resultadoEsperado) {
        ETS_Calculadora calculadora = new ETS_Calculadora(a, b);
        assertEquals(resultadoEsperado, calculadora.resta());
    }

    static Stream<Arguments> datosParaTestResta() {
        return Stream.of(
            of(1, 1, 0),
            of(5, 3, 2),
            of(10, 5, 5),
            of(0, 0, 0),
            of(-1, -1, 0),
            of(10, -5, 15)
        );
    }

    @ParameterizedTest
    @MethodSource("datosParaTestMultiplica")
    public void testMultiplica(int a, int b, int resultadoEsperado) {
        ETS_Calculadora calculadora = new ETS_Calculadora(a, b);
        assertEquals(resultadoEsperado, calculadora.multiplica());
    }

    static Stream<Arguments> datosParaTestMultiplica() {
        return Stream.of(
            arguments(1, 1, 1),
            arguments(2, 2, 4),
            arguments(3, 3, 9),
            arguments(4, 4, 16),
            arguments(5, 5, 25)
        );
    }

    @ParameterizedTest
    @MethodSource("datosParaTestDivide")
    public void testDivide(int a, int b, Integer resultadoEsperado) {
        ETS_Calculadora calculadora = new ETS_Calculadora(a, b);
        assertEquals(resultadoEsperado, calculadora.divide2());
    }

    static Stream<Arguments> datosParaTestDivide() {
        return Stream.of(
            of(10, 5, 2),
            of(5, 10, 0),
            of(100, 0, null),
            of(0, 100, 0),
            of(-10, 5, -2),
            of(5, -10, 0),
            of(-100, 0, null),
            of(0, -100, 0)
        );
    }
}
