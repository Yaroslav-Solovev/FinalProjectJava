package MyProgramm.operations;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.ArrayList;

import MyProgramm.domain.ArchiveDocuments;
import MyProgramm.domain.Document;

public class PrintDocument {
    public static ArchiveDocuments enterBase = new ArchiveDocuments();
     	 
    public static void fileSafe() throws ParseException, Exception{
        String fileName = "MyProgramm/Save/document.txt";
        ArrayList<Document> documents = enterBase.printDocuments();
        for (int i = 0; i < documents.size(); i++) { //** Присваивание файлу названия в виде наименования документа */
            fileName = fileName.replace("document", documents.get(i).getTitle()); 
        }

        try (FileWriter file = new FileWriter(fileName, StandardCharsets.UTF_8)) { //** Запись данных в файл инфы по документам + с функцией дозаписи вслучае одинаковых наименований документов */
            for (int i = 0; i < documents.size(); i++) { 
                file.append(documents.get(i).getInfo());
                file.append('\n');
            }
            file.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    } 
}
