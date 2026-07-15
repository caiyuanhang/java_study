package com.testing.oop2.Abstract.Demo03;

public class AndroidEngineer extends Developer {
    public AndroidEngineer() {
    }

    public AndroidEngineer(int id, String name) {
        super(id, name);
    }

    public void work(int id, String name) {
        System.out.println("员工号为 " + id + " 的 " + name + " 员工，正在研发电商的手机客户端软件");
    }
}
