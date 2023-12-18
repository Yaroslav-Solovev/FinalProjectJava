package MyProgramm.security;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import MyProgramm.console.ConsoleLine;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class LoginToTheApplication {
    public static ConsoleLine consoleLine = new ConsoleLine();
     	 
    public static int loginAndPasswordVerification() throws ParseException, Exception{
        int result = 0;
        LoginConnect loginConnect = new LoginConnect(null, null);
        System.out.println("Введите логин: ");
        loginConnect.setLogin(consoleLine.getString());
        System.out.println("Введите пароль: ");
        loginConnect.setPassword(consoleLine.getString());
        
        String fileUserConnect = "MyProgramm/security/user.txt";
        //fileUserConnect = fileUserConnect.replace("user", loginConnect.getLogin()); //** Присваивание файлу названия в виде логина */

        try (FileWriter file = new FileWriter(fileUserConnect, StandardCharsets.UTF_8)) { //** Запись данных в файл инфы по пользователю (логин и пароль) */
            file.append(loginConnect.getInfo());
            file.append('\n');
            file.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        BufferedInputStream file1 = new BufferedInputStream(new FileInputStream("MyProgramm/security/user.txt"));
        BufferedInputStream file2 = new BufferedInputStream(new FileInputStream("MyProgramm/security/userMobile.txt"));
        int b1 = 0, b2 = 0;
        while (b1 != -1 && b2 != -1) {
            if (b1 != b2) {
                result = 1;
            }
            b1 = file1.read();
            b2 = file2.read();
        }
        file1.close();
        file2.close();
        return result;
    }
}