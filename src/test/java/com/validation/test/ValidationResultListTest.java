package com.validation.test;

import com.geo.decconv.event.ActionType;
import com.geo.decconv.event.errors.ErrorMessages;
import com.geo.decconv.event.validation.ValidationResult;
import com.geo.decconv.event.validation.ValidationResultList;
import com.geo.decconv.event.validation.ValidationResultListImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by Tidus on 11/10/2017.
 */
public class ValidationResultListTest {
    @Test
    public void testValidationResultList() {
        ValidationResultList validationResultList = new ValidationResultListImpl();

        validationResultList.addResult(new ValidationResult(false, ActionType.BINARY, ErrorMessages.BIN_VAL_MSG));
        validationResultList.addResult(new ValidationResult(false, ActionType.HEXADECIMAL, ErrorMessages.HEX_VAL_MSG));

        assertEquals(2, validationResultList.getValidationErrors().get().size());

        System.out.println(validationResultList.getErrorMessages()); //Check Manually also
        assertEquals(ErrorMessages.BIN_VAL_MSG + "\n" + ErrorMessages.HEX_VAL_MSG, validationResultList.getErrorMessages());

        validationResultList.addResult(new ValidationResult(true, ActionType.DECIMAL));

        //Same Checks again

        assertEquals(2, validationResultList.getValidationErrors().get().size());

        System.out.println(validationResultList.getErrorMessages()); //Check Manually also
        assertEquals(ErrorMessages.BIN_VAL_MSG + "\n" + ErrorMessages.HEX_VAL_MSG, validationResultList.getErrorMessages());

        assertEquals(true, validationResultList.hasErrors());

        validationResultList = new ValidationResultListImpl();

        validationResultList.addResult(new ValidationResult(true, ActionType.BINARY));
        validationResultList.addResult(new ValidationResult(true, ActionType.DECIMAL));

        assertEquals(false, validationResultList.getValidationErrors().isPresent());

        try {
            assertEquals("", validationResultList.getErrorMessages());
            fail();
        } catch (IllegalArgumentException ex) {
            System.out.println("IllegalArgumentException Correctly Thrown with message: \n" + "\"" + ex.getMessage() + "\"");
        }
    }
}
