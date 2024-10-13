package com.nasr.template.solution;

import com.nasr.template.common.AuditTrail;

public abstract class Task {

    private final AuditTrail auditTrail;

    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public final void complete(){
        execute();
        auditTrail.record(this.getClass().getSimpleName());

    }

    /*
    we used protected because in subclass we use protected access modifier for execute() method and not accessible
    and this method accessible from that package or child class instead of outside
    we only want to access complete() method from outside
    * */
    protected abstract void  execute();
}
