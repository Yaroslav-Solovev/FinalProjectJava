package MyProgramm.operations;

import java.util.ArrayList;
import java.util.List;
import MyProgramm.console.ConsoleLine;
import MyProgramm.domain.ArchiveDocuments;
import MyProgramm.domain.Document;

public class RemoveDocument {
    public static ArchiveDocuments enterBase = new ArchiveDocuments();
    public static ConsoleLine consoleLine = new ConsoleLine();
    
    public static List<Document> removeDocument() throws Exception { //** Удаление документа из базы данных */
        System.out.println("Введите наименование документа: ");
        String titleDocument = new String (consoleLine.getString());
        ArrayList<Document> documents = enterBase.printDocuments();
        for (int i = 0; i < documents.size(); i++) { 
            if (documents.get(i).getTitle().equalsIgnoreCase(titleDocument) == true){
                documents.remove(i);
            }
        }
        return documents;
    }
}
