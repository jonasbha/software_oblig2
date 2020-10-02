/*
Et år er et skuddår:

- Når det er delelig med 4, men ikke 100
- Når det er delelig med 400
(For eksempel var år 2000 et skuddår)

Et år er ikke et skuddår:

- Når det ikke er delelig med 4
- Når det er delelig med 100, men ikke 400.
(For eksempel var ikke 1700, 1800 og 1900 skuddår, ei heller blir 2100 et)
* */

public class LeapYear {

    public static boolean isLeapYear(int year) {

        if (year < 0) {
            return false;
        } else if (year % 4 != 0) {
            return false;
        } else if (year % 4000 == 0) {
            return false;
        } else if (year % 100 == 0 && year % 400 != 0) {
            return false;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        }
        return false;
    }

}
