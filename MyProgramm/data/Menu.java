package MyProgramm.data;

import MyProgramm.operations.AddDocument;
import MyProgramm.operations.AddContract;
import MyProgramm.operations.AddControlDocument;
import MyProgramm.operations.OutAllDocuments;
import MyProgramm.operations.OutAllContracts;
import MyProgramm.operations.OutAllControlDocuments;
import MyProgramm.operations.PrintContract;
import MyProgramm.operations.PrintDocument;
import MyProgramm.operations.PrintControlDocument;
import MyProgramm.operations.RemoveDocument;
import MyProgramm.operations.SumContracts;

public class Menu { //** Класс определяющий меню*/
    InterfaceRepository ui;

    public Menu() {
        ui = new InMemoryRepository();
    }
    
    public void start() throws Exception {
        StringBuilder sb = new StringBuilder()
                .append("\n ==== \n")
                .append("1 - Добавление документа в базу данных\n")
                .append("2 - Удаление документа из базы данных\n")
                .append("3 - Вывод списка документов\n")
                .append("4 - Добавление договора в базу данных\n")
                .append("5 - Вывод списка договоров\n")
                .append("6 - Добавление контрольного документа в базу данных\n")
                .append("7 - Вывод списка контрольных документов\n")
                .append("8 - Вывод на печать реестра договоров\n")
                .append("9 - Вывод на печать реестра документов\n")
                .append("10 - Вывод на печать реестра контрольных документов\n")
                .append("11 - Расчет суммы договоров\n")
                .append("0 - Выход из приложения\n");
                
        while (true) {
            ui.set(sb.toString());
            switch (ui.get()) {
                case "1":
                    AddDocument.addDocument();
                    System.out.println("Операция прошла успешно");
                    break;
                case "2":
                    RemoveDocument.removeDocument();
                    System.out.println("Операция прошла успешно");
                    break;
                case "3":
                    OutAllDocuments.getAllDocuments();
                    break;
                case "4":
                    AddContract.addContract();
                    System.out.println("Операция прошла успешно");
                    break;
                case "5":
                    OutAllContracts.getAllContracts();
                    break;
                case "6":
                    AddControlDocument.addControlDocument();
                    System.out.println("Операция прошла успешно");
                    break;
                case "7":
                    OutAllControlDocuments.getAllControlDocuments();
                    break;
                case "8":
                    PrintContract.fileSafe();
                    System.out.println("Файл записан");
                    break;
                case "9":
                    PrintDocument.fileSafe();
                    System.out.println("Файл записан");
                    break;
                case "10":
                    PrintControlDocument.fileSafe();
                    System.out.println("Файл записан");
                    break;
                case "11":
                    SumContracts.sumContracts();
                    break;
                case "0":
                    System.out.println("Завершение работы");
                    return;
                default:
                    return;
            }   
        }
    }
}
