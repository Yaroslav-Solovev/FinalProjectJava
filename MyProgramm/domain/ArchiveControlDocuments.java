package MyProgramm.domain;

import java.util.ArrayList;
import MyProgramm.console.ConsoleLine;
import MyProgramm.console.ConsoleNumber;

public class ArchiveControlDocuments { //** Архив документов, находящихся на контроле*/
    //public static ArrayList<ControlDocument> allControlDocuments;
    public static ConsoleLine consoleLine = new ConsoleLine();
    public static ConsoleNumber consoleNumber = new ConsoleNumber();
        
    public static ArrayList<ControlDocument> printСontrolDocuments() throws Exception {
        ControlDocument сontrolDocument1 = new ControlDocument("1", "Постановление по делу об АП ч.1 ст.20.4 КоАП РФ", "04.04.2023", "Предписания контролирующих/надзорных органов", "ГУ МЧС по ТО", "13.06.2023");
        ControlDocument сontrolDocument2 = new ControlDocument("2", "Представление о нарушении в сфере оказания медицинских услуг", "12.06.2023", "Предписания контролирующих/надзорных органов", "Прокуратура по ТО", "11.07.2023");
        ControlDocument сontrolDocument3 = new ControlDocument("3", "Решение по делу №А70-15045/2023", "21.07.2023", "Судебное/исполнительное производство", "Арбитражный суд по ТО", "20.08.2023");
        ControlDocument сontrolDocument4 = new ControlDocument("4", "Требование об уплате неустойки по договору от 04.06.2023 № 456/23", "04.06.2023", "Претензионная работа", "ООО Рога и Копыта", "19.06.2023");
        ControlDocument сontrolDocument5 = new ControlDocument("5", "Обращение по вопросам льгот на оказываемые услуги", "23.07.2023", "Жалобы/обращения", "Петров И.Р.", "22.08.2023");
        ArrayList<ControlDocument> allControlDocuments = new ArrayList<ControlDocument>();
        allControlDocuments.add(сontrolDocument1);
        allControlDocuments.add(сontrolDocument2);
        allControlDocuments.add(сontrolDocument3);
        allControlDocuments.add(сontrolDocument4);
        allControlDocuments.add(сontrolDocument5);
        return allControlDocuments;
    }
}
