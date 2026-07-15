package com.testing.oop2.Abstract.Demo03;

public class HardwareEngineer extends Maintainer {
    public HardwareEngineer() {
    }

    public HardwareEngineer(int id, String name) {
        super(id, name);
    }

    public void work(int id, String name){
        System.out.println("员工号为 " + this.getId() + " 的 " + this.getName() + " 员工，正在修复电脑主板");
    }
}
