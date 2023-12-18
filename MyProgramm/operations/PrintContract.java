package MyProgramm.operations;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.ArrayList;
import MyProgramm.domain.ArchiveContracts;
import MyProgramm.domain.Contract;


public class PrintContract {
    
    public static ArchiveContracts enterBase = new ArchiveContracts();
     	 
    public static void fileSafe() throws ParseException, Exception{
        String fileName = "MyProgramm/Save/contract.txt";
        ArrayList<Contract> contracts = enterBase.printContracts();
        for (int i = 0; i < contracts.size(); i++) { //** Присваивание файлу названия в виде контрагента */
            fileName = fileName.replace("contract", contracts.get(i).getСounterparty()); 
        }

        try (FileWriter file = new FileWriter(fileName, StandardCharsets.UTF_8)) { //** Запись данных в файл инфы по договорам + с функцией дозаписи вслучае одинаковых контрагентов */
            for (int i = 0; i < contracts.size(); i++) { 
                file.append(contracts.get(i).getInfo());
                file.append('\n');
            }
            file.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    } 
}
