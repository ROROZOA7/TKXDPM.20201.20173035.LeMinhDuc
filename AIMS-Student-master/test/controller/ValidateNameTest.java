package controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidateNameTest extends Object {
    private PlaceOrderController placeOrderController;
    @BeforeEach
    void setUp() throws Exception{
        placeOrderController = new PlaceOrderController();
    }
    @ParameterizedTest
    @CsvSource({"Nguyen Van A,true",
            "Nguyen 12,false",
            "Nguyen @,false",
            "12 @,false"
    })
    @Test
    void test(String name, boolean expected){
        boolean isValided = placeOrderController.validateName(name);
        assertEquals(expected,isValided);
    }
}