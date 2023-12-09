package MyProgramm.domain;

import java.util.ArrayList;
import MyProgramm.console.ConsoleLine;
import MyProgramm.console.ConsoleNumber;

public class ArchiveDocuments { //** Архив документов*/
    //public static ArrayList<Document> allDocuments;
    public static ConsoleLine consoleLine = new ConsoleLine();
    public static ConsoleNumber consoleNumber = new ConsoleNumber();
        
    public static ArrayList<Document> printDocuments() throws Exception {
        Document document1 = new Document("1", "Устав", "04.02.2023", "Учредительный документ");
        Document document2 = new Document("2", "Колективный договор", "23.04.2023", "Локальный нормативный акт");
        Document document3 = new Document("3", "Положение об оплате труда", "18.02.2023", "Локальный нормативный акт");
        Document document4 = new Document("4", "Правила внутреннего трудового распорядка", "20.02.2023", "Локальный нормативный акт");
        ArrayList<Document> allDocuments = new ArrayList<Document>();
        allDocuments.add(document1);
        allDocuments.add(document2);
        allDocuments.add(document3);
        allDocuments.add(document4);
        return allDocuments;
    }
}
