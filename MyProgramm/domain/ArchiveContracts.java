package MyProgramm.domain;

import java.util.ArrayList;
import MyProgramm.console.ConsoleLine;
import MyProgramm.console.ConsoleNumber;

public class ArchiveContracts { //** Архив договоров*/
    //public static ArrayList<Contract> allContracts;
    public static ConsoleLine consoleLine = new ConsoleLine();
    public static ConsoleNumber consoleNumber = new ConsoleNumber();

    public static ArrayList<Contract> printContracts() throws Exception {
        Contract contract1 = new Contract("1", "04.03.2023", "ООО Рога и Копыта", "Поставка мяса", 45000.08,"Расходный");
        Contract contract2 = new Contract("2", "19.02.2023", "АО ЭнергоСбыт", "Поставка электроэнергии", 523000.43, "Расходный");
        Contract contract3 = new Contract("3", "13.05.2023", "ООО СтройКам", "Поставка строительный материалов", 5004302.98, "Расходный");
        Contract contract4 = new Contract("4", "24.05.2023", "ГАУ МедЦентр", "Поставка медицинского оборудования", 2144000.68, "Доходный");
        Contract contract5 = new Contract("5", "06.07.2023", "ООО Рога и Копыта", "Поставка рыбы", 29000.98,"Расходный");
        ArrayList<Contract> allContracts = new ArrayList<Contract>();
        allContracts.add(contract1);
        allContracts.add(contract2);
        allContracts.add(contract3);
        allContracts.add(contract4);
        allContracts.add(contract5);
        return allContracts;
    }
}
