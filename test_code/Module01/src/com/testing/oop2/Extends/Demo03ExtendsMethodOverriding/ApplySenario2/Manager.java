package com.testing.oop2.Extends.Demo03ExtendsMethodOverriding.ApplySenario2;

public class Manager extends Employee {
    @Override
    public void work() {
        // 先调用父类原有逻辑
        super.work();
        // 子类扩展：增加管理日志
        System.out.println("经理额外：分配任务、审批流程");
    }
}
