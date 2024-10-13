package com.nasr.template.solution;

import com.nasr.template.common.AuditTrail;

public class TransferMoneyTask extends Task {


    public TransferMoneyTask(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    protected void execute(){
        System.out.println("transfer money task");
    }
}
