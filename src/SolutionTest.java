import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Esta clase es solo para testear la otra a modo de ejemplo.
 */

public class SolutionTest {
    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }

    @Test
    public void testSomeDashLowerStart2() {
        String input = "the-stealth_warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }

    @Test
    public void testFraseOrdinaria() {
        String input = "el_cielo-es-Rosa";
        System.out.println("input: "+input);
        assertEquals("elCieloEsRosa", Solution.toCamelCase(input));
    }
}