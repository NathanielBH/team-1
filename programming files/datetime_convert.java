// Bug 1: Change the dateStr format
// Original dateStr: "2022-03-17 10:45:30"
// Bug 2: Incorrect format pattern
// Use "dd/MM/yyyy HH:mm:ss" instead of "MM/dd/yyyy HH:mm:ss"
// a.h.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetime_convert {

    public static void main(String[] args) {
        String dateStr = "17-03-2022 10:45:30";

        // Create format for date strings
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // Create dateObj using dateStr and formatter
        LocalDateTime dateObj = LocalDateTime.parse(dateStr, formatter);

        // Convert object to string formattedDate
        String formattedDate = dateObj.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        // Print the formatted string
        System.out.println(formattedDate);
    }
}
