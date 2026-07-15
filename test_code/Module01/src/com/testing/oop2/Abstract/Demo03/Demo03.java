package com.testing.oop2.Abstract.Demo03;

public class Demo03 {
    public static void main(String[] args) {
        JavaeeEngineer je = new JavaeeEngineer(1, "java开发");
        je.work(1, "java开发"); // 内部是 get 方法

        AndroidEngineer ae = new AndroidEngineer(2, "安卓开发");
        ae.work(2, "安卓开发"); // 方法传参

        NetworkEngineer ne = new NetworkEngineer(3, "网络开发");
        ne.work(3, "网络开发");

        HardwareEngineer he = new HardwareEngineer(4, "硬件开发");
        he.work(4, "硬件开发");
    }
}
