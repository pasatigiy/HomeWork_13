import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Task_1_2_Date {

    public static void main(String[] args) {
        method1();
    }

    /**
     * 1. Получить день недели по дате
     */

    public static void method1() {
        Calendar calendar = new GregorianCalendar(2021, Calendar.MAY, 31);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    }

    /**
     * Метод выводит на консоль дату следующего любого дня недели. Тут для вторника.
     */

    public static void method2() {
        Calendar calendar;
        calendar = new GregorianCalendar();
        int dayOfWeek = 3;  // номер дня недели, который нас интерисует, в данном случае вторник - 3 день недели
        int amount = (dayOfWeek - (calendar.get(Calendar.DAY_OF_WEEK)));
        if (amount >= 0) {
            calendar.add(Calendar.DAY_OF_MONTH, amount);

            System.out.println(calendar.getTime());
            System.out.println(amount);
        } else {
            amount = amount + 7;
            calendar.add(Calendar.DAY_OF_MONTH, amount);
            System.out.println(calendar.getTime());
            System.out.println(amount);
        }
    }
}

