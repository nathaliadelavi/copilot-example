package com.poc.copilotexample;

public class CpfValidation {
    // validate CPF
    public boolean validateCPF(String cpf) {
        if (!cpf.matches("\\d{3}.\\d{3}.\\d{3}-\\d{2}")) {
            return false;
        }

        String[] cpfParts = cpf.split("-");
        int cpfPart1 = Integer.parseInt(cpfParts[0]);
        int cpfPart2 = Integer.parseInt(cpfParts[1]);

        if (cpfPart1 < 0 || cpfPart1 > 999) {
            return false;
        }

        if (cpfPart2 < 0 || cpfPart2 > 99) {
            return false;
        }

        return true;
    }
}
