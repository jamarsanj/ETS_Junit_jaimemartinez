package ETS_Calculadora;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class ETS_CalculadoraTest {
	
	private ETS_Calculadora calcu;
	private int resultado;
	private Integer resultado2;
	
	@Before
	public void creaETS_Calculadora() {
		calcu = new ETS_Calculadora(20,10);
	}

	@After
	public void borraETS_Calculadora() {
		calcu = null;
	}
	
    @Test
    public void testSuma() {
        resultado = calcu.suma();
        assertEquals(30,resultado);
    }
    
    @Test
    public void testResta() {
        resultado = calcu.resta();
        assertEquals(10,resultado);
    }
    
    @Test
    public void testResta2True() {
        boolean resultado = calcu.resta2();
        assertTrue(resultado2);
    }
    
    @Test
    public void testResta2False() {
    	boolean resultado2 = calcu.resta2();
        assertFalse(resultado2);
    }
    
    @Test
    public void testMultiplica() {
        resultado = calcu.multiplica();
        assertEquals(200,resultado);
    }
    
    @Test
    public void testDivide() {
        resultado = calcu.divide();
        assertEquals(2,resultado);
    }
    
     
}

