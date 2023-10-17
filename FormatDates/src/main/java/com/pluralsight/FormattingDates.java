package com.pluralsight;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormattingDates {
        public static void main(String[] args) {
            // Get the current date and time in GMT (UTC) time zone
            ZonedDateTime gmtDateTime = ZonedDateTime.now(ZoneId.of("GMT"));

            // Get the current date and time in your local time zone
            ZonedDateTime localDateTime = ZonedDateTime.now(ZoneId.systemDefault());

            // Create formatters for the desired date and time formats
            DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm", Locale.ENGLISH);
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH);
            DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
            DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm", Locale.ENGLISH);

            // Display the current date and time in the requested formats
            System.out.println(formatter1.format(gmtDateTime));
            System.out.println(formatter2.format(gmtDateTime));
            System.out.println(formatter3.format(gmtDateTime));
            System.out.println(formatter4.format(gmtDateTime));

            // Display the current date and time in your local time zone
            System.out.println(formatter1.format(localDateTime));
            System.out.println(formatter2.format(localDateTime));
            System.out.println(formatter3.format(localDateTime));
            System.out.println(formatter4.format(localDateTime));


        }
    }
