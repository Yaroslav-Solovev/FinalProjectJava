package MyProgramm.operations;

import java.util.ArrayList;
import MyProgramm.console.ConsoleLine;
import MyProgramm.console.ConsoleNumber;
import MyProgramm.console.ConsoleData;
import MyProgramm.domain.Contract;

public class AddContract { //** Добавление договора*/
    public static ArrayList<Contract> allContracts;
    public static ConsoleLine consoleLine = new ConsoleLine();
    public static ConsoleNumber consoleNumber = new ConsoleNumber();
    public static ConsoleData consoleData = new ConsoleData();

    public static ArrayList<Contract> addContract() throws Exception {
        Contract contracts = new Contract(null, null, null, null, null, null);
        System.out.println("Введите следующую информацию по договору: ");
        System.out.println("Введите номер договора: ");
        contracts.setId(consoleLine.getString());
        System.out.println("Введите дату договора: ");
        contracts.setDate(consoleData.getDate());
        System.out.println("Введите наименование контрагента: ");
        contracts.setCounterparty(consoleLine.getString());
        System.out.println("Введите предмет договора: ");
        contracts.setSubjectOftheContract(consoleLine.getString());
        System.out.println("Введите цену договора: ");
        contracts.setPrice(consoleNumber.getNum());
        System.out.println("Выбирите тип договора(1-Доходный; 2-Расходный): ");
        switch (consoleLine.getString()) {
            case "1":
                contracts.setCategoryContract("Доходный");
                break;
            case "2":
                contracts.setCategoryContract("Расходный");
                break;
        }

        ArrayList<Contract> allContracts = new ArrayList<Contract>();
        allContracts.add(contracts);
        return allContracts;
    }
}
