package com.nasr.template;

import com.nasr.template.common.AuditTrail;
import com.nasr.template.solution.BankApplication;
import com.nasr.template.solution.ReportingTask;
import com.nasr.template.solution.Task;

public class TestSolution {
    public static void main(String[] args) {

        AuditTrail auditTrail = new AuditTrail();

        BankApplication bankApplication = new BankApplication();

        Task task= new ReportingTask(auditTrail);
//        we don't access to execute() method of task only access to complete() method
        bankApplication.execute(task);
    }
}
