package com.testing.chapter10.accessModifiers.childPackage2;

import com.testing.chapter10.accessModifiers.childPackage1.Parent;

public class DiffNotChildCls {
    public void fn(){
        Parent p = new Parent();
        System.out.println(p.name1);
        // 'name2' 在 'com.testing.chapter10.accessModifiers.childPackage1.Parent' 中具有 protected 访问权限
        // System.out.println(p.name2);
        // 'name3' 在 'com.testing.chapter10.accessModifiers.childPackage1.Parent' 中不为 public。无法从外部软件包访问
        // System.out.println(p.name3);
        // 'name4' 在 'com.testing.chapter10.accessModifiers.childPackage1.Parent' 中具有 private 访问权限
        // System.out.println(p.name4);
    }
}
