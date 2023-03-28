package ETS_Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ETS_CalculadoraTest {

    @Test
    public void testSuma() {
        ETS_Calculadora calculadora = new ETS_Calculadora(5, 7);
        assertEquals(12, calculadora.suma());
    }
    
    @Test
    public void testResta() {
        ETS_Calculadora calculadora = new ETS_Calculadora(5, 7);
        assertEquals(2, calculadora.resta());
    }
    
    @Test
    public void testMultiplica() {
        ETS_Calculadora calculadora = new ETS_Calculadora(5, 7);
        assertEquals(35, calculadora.multiplica());
    }
    
    @Test
    public void testDivide() {
        ETS_Calculadora calculadora = new ETS_Calculadora(15, 3);
        assertEquals(5, calculadora.divide());
    }
    
    @Test
    public void testDivide2() {
        ETS_Calculadora calculadora = new ETS_Calculadora(15, 0);
        assertNull(calculadora.divide2());
    }
    
    @Test
    public void testResta2() {
        ETS_Calculadora calculadora = new ETS_Calculadora(5, 7);
        assertFalse(calculadora.resta2());
        calculadora = new ETS_Calculadora(7, 5);
        assertTrue(calculadora.resta2());
    }
    
    @Test
    public void testNum1NotNull() {
        ETS_Calculadora calculadora = new ETS_Calculadora(5, 7);
        assertNotNull(calculadora.num1);
    }
}
