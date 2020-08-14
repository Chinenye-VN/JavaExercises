package com.qa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.qa.day2.Exercise1;
import com.qa.day6.TempConverter;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest {
    static Exercise1 calc;

    @BeforeClass
    public static void initialise() {
        Exercise1 calc = new Exercise1();

    }

    @Test
    @Ignore
    public void test1() {
        assertEquals(calc.addingIntegers(2, 3), 5);

    }

    @Test
    @Ignore
    public void test2() {
        assertEquals(calc.divideIntegers(10, 5), 2, 0);
        assertEquals(calc.divideIntegers(5, 10), 0, 0);
    }

    @Test
    public void test3() {
        assertEquals(calc.subtractIntegers(3, 2), 1);

    }

    @Test
    public void temp1() {
        TempConverter calc = new TempConverter();
        assertEquals(calc.convertFahrenheitToCelsius(100), 37.7778, 0.1);
    }

    @Test
    public void temp2() {
        TempConverter calc = new TempConverter();
        assertEquals(calc.convertCelsiusToFahrenheit(10), 50, 0.1);
    }

    boolean bool;
    @Test
    public void temp3() {
        TempConverter calc = new TempConverter();

        if(calc.convertCelsiusToFahrenheit(10)==50) {
            bool = true;
        }
        assertTrue("True",bool);
    }
}