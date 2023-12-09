package MyProgramm.console;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ConsoleData {
    static Scanner scanner = new Scanner(System.in);
    public static ConsoleLine consoleLine = new ConsoleLine();
    
    public String getDate() throws Exception{ //** Метод проверки на ввод даты с консоли на ошибку */
        String dateStr = consoleLine.getString();
        SimpleDateFormat src = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat dst = new SimpleDateFormat("dd.MM.yyyy");
        Date parsed = src.parse(dateStr);
        final String formatted = dst.format(parsed);
        return formatted;
    }
}
