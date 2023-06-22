package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void bracketsBeforeStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]TestString"));
    }

    @Test
    public void bracketsInMiddleOfStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Test[Strin]g"));
    }
    @Test
    public void bracketsAtStartAndEndOfStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[TestString]"));
    }
    @Test
    public void onlyOneBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void onlyOneBracketInStringReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[TestString"));
    }
    @Test
    public void closedBracketBeforeOpenInStringReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Test]Strin[g"));
    }
    @Test
    public void onlyBracketsClosedBeforeOpen(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void twoSetsOfBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Test] [String]"));
    }
    @Test
    public void oddNumberOfBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Test[String]"));
    }



}
