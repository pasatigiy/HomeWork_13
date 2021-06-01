import java.util.Scanner;

/** - если в консоль введена цифра 1, то: использования интерфейса с целочисленным типом и передать
 *       в метод интерфейса логику нахождения факториала числа.
 * - если в консоль введена цифра 2, то: использования интерфейса со строковым типом и передать
 *      в метод интерфейса логику реверса строки(вывода строки в обратном порядке).
 */

public class BlockLambda {

    public static void main(String[] args) {

        System.out.println("Введите число 1 или 2");
        Scanner scan = new Scanner(System.in);
        String n = scan.next();

        method1(n); }

    static void method1 (String n) {
        String str1 = "hello";
        int y = 5;

        if (n.equals("1")) {
            MyNumber factorial = (x) -> {
                int result = 1;
                for (int i = 1; i <= x; i++)
                    result = i * result;
                return result;
            };
            System.out.println(factorial.func(y));
        } else {
            if (n.equals("2")) {
                MyString reverse = (str) -> {
                    new StringBuilder(str).reverse().toString();
                    return new StringBuilder(str).reverse().toString();
                };
                System.out.println(reverse.string(str1));
            }
        }
    }
}


