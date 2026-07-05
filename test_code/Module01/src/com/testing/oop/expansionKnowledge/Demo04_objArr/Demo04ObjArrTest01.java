package com.testing.oop.expansionKnowledge.Demo04_objArr;

public class Demo04ObjArrTest01 {
    static void main() {
        Person p1 = new Person("韩老魔", 1100);
        Person p2 = new Person("轮回道祖", 30100);
        Person p3 = new Person("小八", 130);
        Person[] objArr = {p1, p2, p3};
        for (Person person : objArr) {
            System.out.println("name==" + person.getName() + ", age==" + person.getAge());
        }
    }
}
