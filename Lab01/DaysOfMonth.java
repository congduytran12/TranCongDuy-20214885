import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter month");
        String strMonth = sc.nextLine();
        System.out.println("Please enter year: ");
        int iYear = sc.nextInt();

        if (strMonth.equals("January") || strMonth.equals("Jan.") || strMonth.equals("Jan") || strMonth.equals("1") ||
                strMonth.equals("March") || strMonth.equals("Mar.") || strMonth.equals("Mar") || strMonth.equals("3") ||
                strMonth.equals("May") || strMonth.equals("5") ||
                strMonth.equals("July") || strMonth.equals("Jul") || strMonth.equals("7") ||
                strMonth.equals("August") || strMonth.equals("Aug.") || strMonth.equals("Aug") || strMonth.equals("8") ||
                strMonth.equals("October") || strMonth.equals("Oct.") || strMonth.equals("Oct") || strMonth.equals("10") ||
                strMonth.equals("December") || strMonth.equals("Dem.") || strMonth.equals("Dem") || strMonth.equals("12")) {
            System.out.println("Number of days: 31");
        }
        else if (strMonth.equals("April") || strMonth.equals("Apr.") || strMonth.equals("Apr") || strMonth.equals("4") ||
                strMonth.equals("June") || strMonth.equals("Jun") || strMonth.equals("6") ||
                strMonth.equals("September") || strMonth.equals("Sept.") || strMonth.equals("Sep") || strMonth.equals("9") ||
                strMonth.equals("November") || strMonth.equals("Nov.") || strMonth.equals("Nov") || strMonth.equals("11")) {
            System.out.println("Number of days: 30");
        }
        else if (strMonth.equals("February") || strMonth.equals("Feb.") || strMonth.equals("Feb") || strMonth.equals("2")) {
            if ((iYear % 4 == 0 && iYear % 100 != 0) || iYear % 400 == 0) {
                System.out.println("Number of days: 29");
            } else {
                System.out.println("Number of days: 28");
            }
        } else {
            System.out.println("Please enter again!");
        }
    }
}