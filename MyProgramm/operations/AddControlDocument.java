package MyProgramm.operations;

import java.util.ArrayList;
import MyProgramm.console.ConsoleLine;
import MyProgramm.console.ConsoleData;
import MyProgramm.domain.ControlDocument;

public class AddControlDocument {
    public static ArrayList<ControlDocument> allControlDocuments;
    public static ConsoleLine consoleLine = new ConsoleLine();
    public static ConsoleData consoleData = new ConsoleData();
        
    public static ArrayList<ControlDocument> addControlDocument() throws Exception { //** Добавление контрольного документа*/
        ControlDocument  controlDocuments = new  ControlDocument(null, null, null, null, null, null);
        System.out.println("Введите следующую информацию по документу: ");
        System.out.println("Введите номер документа: ");
        controlDocuments.setId(consoleLine.getString());
        System.out.println("Введите наименование документа: ");
        controlDocuments.setTitle(consoleLine.getString());
        System.out.println("Введите дату документа: ");
        controlDocuments.setDate(consoleData.getDate());
        System.out.println("Выбирите тип документа(1-Предписания контролирующих/надзорных органов; 2-Судебное/исполнительное производство; 3-Претензионная работа; 4-Жалобы/обращения): ");
        switch (consoleLine.getString()) {
            case "1":
                controlDocuments.setCategoryDocument("Предписания контролирующих/надзорных органов");
                break;
            case "2":
                controlDocuments.setCategoryDocument("Судебное/исполнительное производство");
                break;
            case "3":
                controlDocuments.setCategoryDocument("Претензионная работа");
                break;
            case "4":
                controlDocuments.setCategoryDocument("Жалобы/обращения");
                break;
        }
        System.out.println("Введите наименование автора документа: ");
        controlDocuments.setAuthor(consoleLine.getString());
        System.out.println("Введите контрольный срок исполнения документа: ");
        controlDocuments.setPeriodОfExecution(consoleData.getDate());

        ArrayList<ControlDocument> allControlDocuments = new ArrayList<ControlDocument>();
        allControlDocuments.add(controlDocuments);
        return allControlDocuments;
    }
}
