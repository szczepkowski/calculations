package pl.great.waw.calculations;

import org.junit.jupiter.api.Test;
import pl.great.waw.calculations.exceptions.ProductNotExistException;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CalculationsTest {

    @Test
    void add() throws ProductNotExistException {
        Calculations calculations = new Calculations();
        calculations.add(new Product("masło", BigDecimal.TEN));

        assertEquals("masło", calculations.get(0).getName());
    }

    @Test
    void getNonExisting() {
        Calculations calculations = new Calculations();
        calculations.add(new Product("masło", BigDecimal.TEN));

        assertThrows(ProductNotExistException.class, () -> calculations.get(1));
    }

    @Test
    void get() {
    }
}