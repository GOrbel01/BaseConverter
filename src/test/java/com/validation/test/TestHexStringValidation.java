package com.validation.test;

import com.geo.decconv.event.errors.ErrorMessages;
import com.geo.decconv.event.validation.validator.HexValidator;
import com.geo.decconv.event.validation.validator.Validator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tidus on 11/10/2017.
 */
public class TestHexStringValidation {
    @Test
    public void testHexStringValidation() {
        Validator validator = new HexValidator();

        String test = "4012A";
        assertEquals(true, validator.validateData(test).isValid());

        test = "65A44G";
        assertEquals(false, validator.validateData(test).isValid());

        test = "GHCHZSFJL";
        assertEquals(false, validator.validateData(test).isValid());

        test = "8A6S";
        assertEquals(false, validator.validateData(test).isValid());

        assertEquals(ErrorMessages.HEX_VAL_MSG, validator.validateData(test).getMessage());

        test = "734BA";
        assertEquals("", validator.validateData(test).getMessage());
    }
}
