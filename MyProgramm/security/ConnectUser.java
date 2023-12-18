package MyProgramm.security;

import java.io.Console;

public class ConnectUser {
    public static void main (String[] args) {
        Console con = System.console();
        String s = "12345";
        char[] pass = con.readPassword("%s", "Введите пароль:");
        String passw = new String(pass);
        if (passw.equals(s)) {
            System.out.println("Верно");
        } else {
            System.out.println("Не верно");
        }
    }
}
