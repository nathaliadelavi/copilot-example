package com.poc.copilotexample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DateValidationTest {
    // test if date is in utc format
    @Test
    public void testDateIsInUTCFormat() {
        // create a valid date
        String date = "2021-03-31T15:00:00.000Z";
        // call the method that validates if date is in utc format
        boolean isDateInUTCFormat = DateValidation.validateDate(date);
        // assert that the date is in utc format
        Assertions.assertTrue(isDateInUTCFormat);
    }

    // test if date is not in utc format
    @Test
    public void testDateIsNotInUTCFormat() {
        // create a invalid date
        String date = "2021-03-31 15:00:00";
        // call the method that validates if date is in utc format
        boolean isDateInUTCFormat = DateValidation.validateDate(date);
        // assert that the date is not in utc format
        Assertions.assertFalse(isDateInUTCFormat);
    }

    // test if date is null
    @Test
    public void testDateIsNull() {
        // create a null date
        String date = null;
        // call the method that validates if date is in utc format
        boolean isDateInUTCFormat = DateValidation.validateDate(date);
        // assert that the date is not in utc format
        Assertions.assertFalse(isDateInUTCFormat);
    }

    // test if date is empty
    @Test
    public void testDateIsEmpty() {
        // create an empty date
        String date = "";
        // call the method that validates if date is in utc format
        boolean isDateInUTCFormat = DateValidation.validateDate(date);
        // assert that the date is not in utc format
        Assertions.assertFalse(isDateInUTCFormat);
    }

    @Test
    void shouldReturnTrueWhenDateIsValid() {
        String date = "";
        boolean isDateInUTCFormat = DateValidation.validateDate(date);
        Assertions.assertTrue(isDateInUTCFormat);
    }

}
