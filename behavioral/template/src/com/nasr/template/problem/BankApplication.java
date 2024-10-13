package com.nasr.template.problem;

import com.nasr.template.solution.Task;


public class BankApplication {


    public void transfer(TransferMoneyTask task){
        task.execute();
    }

    public void generateReport(ReportingTask task){
        task.execute();
    }

}


