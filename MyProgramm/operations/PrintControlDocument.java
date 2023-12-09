package MyProgramm.operations;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.ArrayList;

import MyProgramm.domain.ArchiveControlDocuments;
import MyProgramm.domain.ControlDocument;

public class PrintControlDocument {
    public static ArchiveControlDocuments enterBase = new ArchiveControlDocuments();
     	 
    public static void fileSafe() throws ParseException, Exception{
        String fileName = "MyProgramm/Save/controlDocument.txt";
        ArrayList<ControlDocument> controlDocuments = enterBase.printСontrolDocuments();
        for (int i = 0; i < controlDocuments.size(); i++) { //** Присваивание файлу названия в виде наименования документа */
            fileName = fileName.replace("file", controlDocuments.get(i).getTitle()); 
        }

        try (FileWriter file = new FileWriter(fileName, StandardCharsets.UTF_8)) { //** Запись данных в файл инфы по документам + с функцией дозаписи вслучае одинаковых наименований документов */
            for (int i = 0; i < controlDocuments.size(); i++) { 
                file.append(controlDocuments.get(i).getInfo());
                file.append('\n');
            }
            file.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    } 
}
