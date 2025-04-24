package merab_enukidze_1.midterm1.t2.chicken.sub;

import merab_enukidze_1.midterm1.t2.chicken.A21;
import merab_enukidze_1.midterm1.t2.pot.actor.A22;

public class R21 {
    public static void main(String[] args) {
        A21 rectangle = new A21();
        A22 monthInfo = new A22();
        
        // Calculate and print rectangle area
        int area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Rectangle area: " + area);
        
        // Get and validate month, then print month name
        int monthNumber = monthInfo.getMonth();
        String monthName;
        
        if (monthNumber >= 1 && monthNumber <= 12) {
            switch (monthNumber) {
                case 1: monthName = "January"; break;
                case 2: monthName = "February"; break;
                case 3: monthName = "March"; break;
                case 4: monthName = "April"; break;
                case 5: monthName = "May"; break;
                case 6: monthName = "June"; break;
                case 7: monthName = "July"; break;
                case 8: monthName = "August"; break;
                case 9: monthName = "September"; break;
                case 10: monthName = "October"; break;
                case 11: monthName = "November"; break;
                case 12: monthName = "December"; break;
                default: monthName = "Invalid month";
            }
            System.out.println("Month name: " + monthName);
        } else {
            System.out.println("Invalid month number: " + monthNumber);
        }
    }
} 