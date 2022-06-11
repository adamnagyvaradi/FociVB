package hu.progmaitc.match;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {




    @Test
    void isPrime() {

        boolean case1 = Prime.isPrime(2);
        assertTrue(case1);
        boolean case2 = Prime.isPrime(3);
        assertTrue(case2);
        boolean case3 = Prime.isPrime(1);
        assertFalse(case3);
        boolean case4 = Prime.isPrime(-3);
        assertFalse(case4);
        boolean case5 = Prime.isPrime(-9);
        assertFalse(case5);
        boolean case6 = Prime.isPrime(Integer.MAX_VALUE);
        assertTrue(case6);
        boolean case7 = Prime.isPrime(0);
        assertFalse(case7);
        boolean case8 = Prime.isPrime(20);
        assertFalse(case8);
        boolean case9 = Prime.isPrime(-20);
        assertFalse(case9);
        boolean case10 = Prime.isPrime( 25);
        assertFalse(case10);


    }

}