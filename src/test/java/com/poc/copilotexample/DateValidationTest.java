package com.poc.copilotexample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DateValidationTest {
    // test if date is in utc format
    @Test
    public void testDateInUtcFormat() {
        // Arrange
        String date = "2020-01-01T00:00:00Z";
        // Act
        boolean result = DateValidation.validateDate(date);
        // Assert
        Assertions.assertTrue(result);
    }

    // test if date is not in utc format
    @Test
    public void testDateNotInUtcFormat() {
        // Arrange
        String date = "2020-01-01";
        // Act
        boolean result = DateValidation.validateDate(date);
        // Assert
        Assertions.assertFalse(result);
    }

    // test if date is empty
    @Test
    public void testDateEmpty() {
        // Arrange
        String date = "";
        // Act
        boolean result = DateValidation.validateDate(date);
        // Assert
        Assertions.assertFalse(result);
    }

    // test if date is null
    @Test
    public void testDateNull() {
        // Arrange
        String date = null;
        // Act
        boolean result = DateValidation.validateDate(date);
        // Assert
        Assertions.assertFalse(result);
    }
}
