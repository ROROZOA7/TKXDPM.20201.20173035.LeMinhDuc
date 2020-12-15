package controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidateAddressTest extends Object {
    private PlaceOrderController placeOrderController;
    @BeforeEach
    void setUp() throws Exception{
        placeOrderController = new PlaceOrderController();
    }
    @ParameterizedTest
    @CsvSource({"Tran Dai Nghia,true",
            "klhsdf @,false",
            "so 1 Dai Co Viet,true",
            "123@ afsjldk,false"
    })
    @Test
    void test(String address, boolean expected){
        boolean isValided = placeOrderController.validateName(address);
        assertEquals(expected,isValided);
    }
}