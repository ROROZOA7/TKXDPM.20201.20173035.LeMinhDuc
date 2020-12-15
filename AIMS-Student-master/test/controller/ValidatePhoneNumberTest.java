package controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidatePhoneNumberTest extends Object {

    private PlaceOrderController placeOrderController;
    @BeforeEach
    void setUp() throws Exception{
        placeOrderController = new PlaceOrderController();
    }
    @ParameterizedTest
    @CsvSource({"0123456789,true",
                "012244,false",
                "asf1234566,false",
                "1234567890,false"
    })
    @Test
    void test(String phone, boolean expected){
        boolean isValided = placeOrderController.validatePhoneNumber(phone);
        assertEquals(expected,isValided);
    }

}