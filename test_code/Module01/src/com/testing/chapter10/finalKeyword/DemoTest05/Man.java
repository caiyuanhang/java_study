package com.testing.chapter10.finalKeyword.DemoTest05;

public class Man {
    // 报错：字段 'name' 可能尚未初始化
    // final String name;

    final String name = "哈哈";

    public void fn (){
        // 报错：无法将值赋给 final 变量 'name'
        // this.name = "嘻嘻";
    }
}
