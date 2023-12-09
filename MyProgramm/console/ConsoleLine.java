package MyProgramm.console;

import java.util.Scanner;

public class ConsoleLine {
    
    static Scanner scanner = new Scanner(System.in);
    
    public String getString() throws Exception { //** Метод проверки на ввод пустой строки */
        String world = scanner.nextLine();
        world = world.trim();
        if(world.isEmpty()){
            throw new IllegalArgumentException("Error: Строка пустая!");
        }
        return world;
    }
}