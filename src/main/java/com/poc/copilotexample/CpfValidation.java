package com.poc.copilotexample;

public class CpfValidation {
    // validate CPF with or without formatting and calculating verifier digits
    public boolean validateCPF(String cpf) {
        // cpf must be 11 digits long
        if (!cpf.matches("\\d{11}")) {
            return false;
        }
        // extract cpf digits
        int[] digits = cpf.chars().map(Character::getNumericValue).toArray();
        // calculate verifier digits
        int[] verifierDigits = calculateVerifierDigits(digits);
        // compare calculated verifier digits with the verifier digits in the cpf
        return verifierDigits[0] == digits[9] && verifierDigits[1] == digits[10];
    }

    // calculate verifier digits
    private int[] calculateVerifierDigits(int[] digits) {
        // calculate first verifier digit
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += digits[i] * (10 - i);
        }
        int firstVerifierDigit = 11 - (sum % 11);
        // calculate second verifier digit
        sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += digits[i] * (11 - i);
        }
        int secondVerifierDigit = 11 - (sum % 11);
        // return verifier digits
        return new int[] { firstVerifierDigit, secondVerifierDigit };
    }
}
