package com.testing.chapter10.accessModifiers.childPackage2;

import com.testing.chapter10.accessModifiers.childPackage1.Parent;

public class DiffChildCls extends Parent {
    public void fn (){
        System.out.println(super.name1);
        System.out.println(super.name2);
        // 'name3' 在 'com.testing.chapter10.accessModifiers.childPackage1.Parent' 中不为 public。无法从外部软件包访问
        // System.out.println(super.name3);
    }
}
