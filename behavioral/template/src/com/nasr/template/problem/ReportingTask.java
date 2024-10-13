package com.nasr.template.problem;

import com.nasr.template.common.AuditTrail;

public class ReportingTask {

    private AuditTrail auditTrail;

    public ReportingTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute(){
        System.out.println("generate report");
        auditTrail.record(this.getClass().getSimpleName());
    }
}
