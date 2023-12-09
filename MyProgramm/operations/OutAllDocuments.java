package MyProgramm.operations;

import java.util.ArrayList;
import MyProgramm.domain.ArchiveDocuments;
import MyProgramm.domain.Document;

public class OutAllDocuments{ //** Вывод списка документов*/
    public static ArchiveDocuments documentsBase = new ArchiveDocuments();
   
    public static ArrayList<Document> getAllDocuments() throws Exception {
        ArrayList<Document> documents = documentsBase.printDocuments();
        for (int i = 0; i < documents.size(); i++) { 
            System.out.println(documents.get(i).getInfo());
        }
        return documents;
    } 
}
