
package TDDPackage;

import TDDPackage.Calculadora;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotSame;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;




public class CalculadoraTest {
   
    
   public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void testSuma()
    {
        assertEquals(8,Calculadora.suma(5,3));
    }
    @Test
    public void testFallaSuma() {
        
        assertEquals(8,Calculadora.suma(5,5));
    }
    
    @Test
    public void testResta()
    {
        assertEquals(0,Calculadora.resta(4,4));
    }

}
