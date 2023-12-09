package MyProgramm.operations;

import java.util.ArrayList;
import MyProgramm.domain.ArchiveControlDocuments;
import MyProgramm.domain.ControlDocument;

public class OutAllControlDocuments {//** Вывод списка контрольных документов*/
    public static ArchiveControlDocuments controlDocumentsBase = new ArchiveControlDocuments();
   
    public static ArrayList<ControlDocument> getAllControlDocuments() throws Exception {
        ArrayList<ControlDocument> controlDocuments = controlDocumentsBase.printСontrolDocuments();
        for (int i = 0; i < controlDocuments.size(); i++) { 
            System.out.println(controlDocuments.get(i).getInfo());
        }
        return controlDocuments;
    } 
}
