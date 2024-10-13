package com.nasr.template.solution;

import com.nasr.template.common.AuditTrail;

public class ReportingTask extends Task {

    public ReportingTask(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    protected void execute() {
        System.out.println("generate pdf");
    }
}
