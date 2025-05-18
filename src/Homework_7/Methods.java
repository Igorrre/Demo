package Homework_7;

/*
 Создать класс как минимум 4 разными методами,
 в каждом методе добавить проверку на исключительные ситуации,
 используя:
 1. try- catch
 2. try-catch, где catch будет несколько
 3. try -catch, использованием multi - catch
 4. try-catch-finally.
 */
public class Methods {

    // Тестирование методов
    public static void main(String[] args) {
        Methods m = new Methods();

        // 1. try-catch
        m.method1(10, 0);

        // 2. try-catch с несколькими catch
        m.method2("a", "10");

        // 3. try-catch multi-catch
        m.method3("4", "x");

        // 4. try-catch-finally
        m.method4(20, 0);

    }

    // 1. Метод с try-catch для обработки деления
    public void method1(int a, int b) {
        try {
            int c = a / b;
            System.out.println("Результат деления: " + c);
        } catch (ArithmeticException e) {
            System.out.println("1.Метод Ошибка: деление на ноль!");
        }
        System.out.println("----------------------");
    }

    // 2. Метод с try-catch, где несколько catch для обработки разных ошибок
    public void method2(String numStr1, String numStr2) {
        try {
            int num1 = Integer.parseInt(numStr1);
            int num2 = Integer.parseInt(numStr2);
            int result = num1 / num2;
            System.out.println("2.Метод Результат деления: " + result);
        } catch (NumberFormatException e) {
            System.out.println("2.Метод Ошибка: некорректный формат числа!");
        } catch (ArithmeticException e) {
            System.out.println("2.Метод Ошибка: деление на ноль!");
        }
        System.out.println("----------------------");
    }

    // 3. Метод с try-catch multi-catch (обработка нескольких исключений одним блоком)
    public void method3(String numStr1, String numStr2) {
        try {
            int num1 = Integer.parseInt(numStr1);
            int num2 = Integer.parseInt(numStr2);
            int result = num1 / num2;
            System.out.println("3.Метод Результат деления: " + result);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("3.Метод Общая ошибка: " + e.getMessage());
        }
        System.out.println("----------------------");
    }

    // 4. Метод с try-catch-finally
    public void method4(int a, int b) {
        try {
            int c = a / b;
            System.out.println("4.Метод Результат деления: " + c);
        } catch (ArithmeticException e) {
            System.out.println("4.Метод Ошибка: деление на ноль!");
        } finally {
            System.out.println("Этот блок выполняется всегда.");
        }
        System.out.println("----------------------");
    }
}