package MyProgramm.operations;

import java.util.ArrayList;
import MyProgramm.console.ConsoleLine;
import MyProgramm.console.ConsoleData;
import MyProgramm.domain.Document;

public class AddDocument{ //** Добавление документа*/
    public static ArrayList<Document> allDocuments;
    public static ConsoleLine consoleLine = new ConsoleLine();
    public static ConsoleData consoleData = new ConsoleData();
        
    public static ArrayList<Document> addDocument() throws Exception {
        Document documents = new Document(null, null, null, null);
        System.out.println("Введите следующую информацию по документу: ");
        System.out.println("Введите номер документа: ");
        documents.setId(consoleLine.getString());
        System.out.println("Введите наименование документа: ");
        documents.setTitle(consoleLine.getString());
        System.out.println("Введите дату документа: ");
        documents.setDate(consoleData.getDate());
        System.out.println("Выбирите тип документа(1-Учредительный документ; 2-Локальный нормативный акт): ");
        switch (consoleLine.getString()) {
            case "1":
                documents.setCategoryDocument("Учредительный документ");
                break;
            case "2":
                documents.setCategoryDocument("Локальный нормативный акт");
                break;
        }
        
        ArrayList<Document> allDocuments = new ArrayList<Document>();
        allDocuments.add(documents);
        return allDocuments;
    }
}
