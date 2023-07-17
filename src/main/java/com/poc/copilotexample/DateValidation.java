package com.poc.copilotexample;

import java.util.Date;

public class DateValidation {
    // create a method that receives string and validate if it is in utc format
    public static boolean validateDate(String date) {
        // if date is null or empty, return false
        if (date == null || date.isEmpty()) {
            return false;
        }
        // try to parse the date
        try {
            // if it is possible to parse the date, return true
            Date parsedDate = new Date(date);
            return true;
        } catch (Exception e) {
            // if it is not possible to parse the date, return false
            return false;
        }
    }
}
