package com.nasr.template;

import com.nasr.template.common.AuditTrail;
import com.nasr.template.problem.BankApplication;
import com.nasr.template.problem.ReportingTask;
import com.nasr.template.problem.TransferMoneyTask;

public class TestProblem {
    public static void main(String[] args) {

        AuditTrail auditTrail = new AuditTrail();

        TransferMoneyTask transferMoneyTask= new TransferMoneyTask(auditTrail);
        ReportingTask reportingTask= new ReportingTask(auditTrail);

        BankApplication bankApplication=  new BankApplication();

        bankApplication.generateReport(reportingTask);
        System.out.println("-".repeat(70));
        bankApplication.transfer(transferMoneyTask);
    }
}
