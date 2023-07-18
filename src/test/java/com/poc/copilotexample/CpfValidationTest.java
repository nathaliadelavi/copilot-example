package com.poc.copilotexample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CpfValidationTest {
    @Test
    void shouldReturnTrueWhenCpfIsValid() {
        CpfValidation cpfValidation = new CpfValidation();
        boolean isValid = cpfValidation.validateCPF("32980354082");
        assert isValid;
    }

    @Test
    void shouldReturnFalseWhenCpfIsInvalid() {
        CpfValidation cpfValidation = new CpfValidation();
        boolean isValid = cpfValidation.validateCPF("32980354083");
        assert !isValid;
    }
}
