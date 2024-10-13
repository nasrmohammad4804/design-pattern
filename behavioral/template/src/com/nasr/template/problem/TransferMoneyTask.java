package com.nasr.template.problem;

import com.nasr.template.common.AuditTrail;

public class TransferMoneyTask {


    private AuditTrail auditTrail;

    public TransferMoneyTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute(){
        System.out.println("transfer money");
        auditTrail.record(this.getClass().getSimpleName());
    }
}
