package MyProgramm.operations;

import java.util.ArrayList;
import MyProgramm.domain.ArchiveContracts;
import MyProgramm.domain.Contract;

public class OutAllContracts { //** Вывод списка договоров*/
    public static ArchiveContracts contractBase = new ArchiveContracts();
   
    public static ArrayList<Contract> getAllContracts() throws Exception {
        ArrayList<Contract> сontracts = contractBase.printContracts();
        for (int i = 0; i < сontracts.size(); i++) { 
            System.out.println(сontracts.get(i).getInfo());
        }
        return сontracts;
    } 
}
