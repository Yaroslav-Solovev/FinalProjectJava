package MyProgramm.operations;

import java.util.ArrayList;
import MyProgramm.console.ConsoleLine;
import MyProgramm.domain.ArchiveContracts;
import MyProgramm.domain.Contract;

public class SumContracts { //** Расчет суммы договоров */
    public static ArchiveContracts enterBase = new ArchiveContracts();
    public static ConsoleLine consoleLine = new ConsoleLine();
    

    public static void sumContracts() throws Exception {
        Double sumProfitable = 0.01*0; //** Доходный договор */
        Double sumСonsumable = 0.01*0; //** Расходный договор */
        Double allSum = 0.01*0;
        ArrayList<Contract> contracts = enterBase.printContracts();
        for (int i = 0; i < contracts.size(); i++) { 
            allSum = allSum + contracts.get(i).getPrice();
            if (contracts.get(i).getCategoryContract() == "Доходный"){
                sumProfitable = sumProfitable + contracts.get(i).getPrice();
            } else {
                sumСonsumable = sumСonsumable + contracts.get(i).getPrice();
            }
        }
        Double resultAllSum = (double) (allSum);
        Double resultProfitable = (double) (sumProfitable);
        Double resultСonsumable = (double) (sumСonsumable);
        System.out.println("Сумма договоров составляет: " + resultAllSum + ", из них: доходных - " + resultProfitable + ", расходных - " + resultСonsumable);
    } 
}