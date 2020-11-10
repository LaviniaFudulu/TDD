
package TDDPackage;

import TDDPackage.Calculadora;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotSame;
/*import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;*/



public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
  /*  
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }*/

    public void testSuma() {
        int total = 8;
        int sum = Calculadora.suma (5, 3);
        assertEquals(sum, total);
    }
    public void testFallaSuma() {
        int total = 9;
        int sum = Calculadora.suma(5, 3);
        assertNotSame(sum, total);
    }
    public void testResta() {
        int total = 0;
        int sub = Calculadora.resta(4, 4);
        assertEquals(sub, total);
    }

}
