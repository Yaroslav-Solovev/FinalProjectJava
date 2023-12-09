package MyProgramm.console;

import java.util.Scanner;
import MyProgramm.data.InterfaceRepository;

public class ConsoleView implements InterfaceRepository{
    
    Scanner in = new Scanner(System.in);

    public String get() {
        return in.next();
    };

    @Override
    public void set(String value) {
        System.out.println(value);
    }
}