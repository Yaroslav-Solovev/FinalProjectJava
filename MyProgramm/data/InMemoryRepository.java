package MyProgramm.data;

import java.util.Scanner;

public class InMemoryRepository implements InterfaceRepository{
    Scanner in = new Scanner(System.in);

    public String get() {
        return in.next();
    };

    @Override
    public void set(String value) {
        System.out.println(value);
    }
}
