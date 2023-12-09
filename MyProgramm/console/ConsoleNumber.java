package MyProgramm.console;

import java.util.Scanner;

public class ConsoleNumber {
    static Scanner scanner = new Scanner(System.in);
    
    public Double getNum() throws Exception {  //** Метод проверки на ввод числа с консоли на ошибку */
        Double number = scanner.nextDouble();
        if (hasNextDouble(number) == true || number <= 0) {
            throw new RuntimeException("Error: Не верно введены данные!");
        }
        return number;
    }
 
    private boolean hasNextDouble(Double number) {
        return false;
    }
}
