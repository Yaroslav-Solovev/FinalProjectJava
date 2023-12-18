package MyProgramm.presentation;

import MyProgramm.console.ConsoleView;
import MyProgramm.data.Menu;
import MyProgramm.security.LoginToTheApplication;


public class Main { //** Класс определяющий запуск программы*/
    public static ConsoleView enterConsoleLine = new ConsoleView();

    public static void main(String[] args) throws Exception {
        //long start = System.nanoTime();
        int result = 1;
        while (result != 0){
            result = LoginToTheApplication.loginAndPasswordVerification();
        }
        new Menu().start();
        //long end = System.nanoTime();
        //System.out.print("Время исполнения: " + (end - start)/1000000 + "ms");
    }
}