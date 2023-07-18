package com.poc.copilotexample;

import java.util.Date;

public class DateValidation {
    // create a method that receives string and validate if it is in utc format
    public static boolean validateDate(String date) {
        if (date == null || date.isEmpty()) {
            return false;
        }

        try {
            Date parsedDate = new Date(date);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
