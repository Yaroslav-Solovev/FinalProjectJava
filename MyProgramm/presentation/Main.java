package MyProgramm.presentation;

import MyProgramm.console.ConsoleView;
import MyProgramm.data.Menu;

public class Main { //** Класс определяющий запуск программы*/
    public static ConsoleView enterConsoleLine = new ConsoleView();

    public static void main(String[] args) throws Exception {
        new Menu().start();
    }
}