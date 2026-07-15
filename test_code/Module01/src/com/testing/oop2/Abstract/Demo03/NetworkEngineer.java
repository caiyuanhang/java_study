package com.testing.oop2.Abstract.Demo03;

public class NetworkEngineer extends Maintainer {
    public NetworkEngineer() {
    }

    public NetworkEngineer(int id, String name) {
        super(id, name);
    }

    public void work(int id, String name) {
        System.out.println("员工号为 " + id + " 的 " + name + " 员工，正在检查网络是否通畅");
    }
}
