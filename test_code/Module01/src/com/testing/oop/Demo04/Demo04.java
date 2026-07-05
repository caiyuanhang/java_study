package com.testing.oop.Demo04;

public class Demo04 {
    public static void main(String[] args) {
        Citizen citizen = new Citizen();
        citizen.name = "江哥";
        citizen.birthday.year = "2025";
        citizen.birthday.month = "07";
        citizen.birthday.day = "07";
        citizen.idCard = "auth123";

        System.out.println(citizen.name + "_" + citizen.birthday.year + citizen.birthday.month + citizen.birthday.day + "_" + citizen.idCard);
    }
}
