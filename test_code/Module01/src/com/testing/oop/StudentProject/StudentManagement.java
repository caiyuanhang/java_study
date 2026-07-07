package com.testing.oop.StudentProject;

import java.util.Scanner;

public class StudentManagement {
    static Scanner sc = new Scanner(System.in);
    
    public void start() {
        StudentManagement.printSelectFuncUI();
    }

    static void printSelectFuncUI() {
        System.out.println("----------------------学生管理系统----------------------");
        System.out.println("1、添加学生");
        System.out.println("2、修改学生");
        System.out.println("3、删除学生");
        System.out.println("4、查看学生列表");
        System.out.println("5、退出");
        System.out.print("请选择（1-5）：");
        int num = sc.nextInt();
        funcBlock(num);
    }

    static void funcBlock(int selectedNum) {
        switch (selectedNum) {
            case 1:
                StudentManagement.addStudent();
                break;
            case 2:
                StudentManagement.editStudent();
                break;
            case 3:
                StudentManagement.deleteStudent();
                break;
            case 4:
                StudentManagement.viewAllStudent();
                break;
            case 5:
                StudentManagement.exitStudentManagement();
                break;
            default:
        }
    }

    static Student inputStudentInfo(String type) {
        System.out.println("----------------------------------------------------");
        System.out.println(type.equals("edit") ? "请您输入要修改的学生编号：" : "请您输入学生编号：");
        int sNum = sc.nextInt();
        System.out.println("请您输入学生姓名：");
        String sName = sc.next();
        System.out.println("请您输入学生年龄：");
        int sAge = sc.nextInt();
        System.out.println("请您输入学生性别");
        String sGender = sc.next();
        return new Student(sNum, sName, sAge, sGender);
    }

    static void addStudent() {
        Student studentObj = inputStudentInfo("add");
        Student[] studentArr = new Student[]{studentObj};
        StudentList.setStudentList(studentArr);
        System.out.println("添加成功！！！");
        StudentManagement.printSelectFuncUI();
    }

    static void editStudent() {
        Student studentObj = inputStudentInfo("edit");
        Student[] allStudent = StudentList.getStudentList();
        for (Student student : allStudent) {
            if (studentObj.getNum() == student.getNum()) {
                int newNum = studentObj.getNum();
                String newName = studentObj.getName();
                int newAge = studentObj.getAge();
                String newGender = studentObj.getGender();
                student.setNum(newNum);
                student.setName(newName);
                student.setAge(newAge);
                student.setGender(newGender);
            }
        }
        System.out.println("修改成功！！！");
        StudentManagement.printSelectFuncUI();
    }

    static void deleteStudent() {
        System.out.println("----------------------------------------------------");
        System.out.println("请您输入要删除的学生编号：");
        int deleteNum = sc.nextInt();
        StudentList.cutStudentList(deleteNum);
        System.out.println("删除成功！！！");
        StudentManagement.printSelectFuncUI();
    }

    static void viewAllStudent() {
        System.out.println("----------------------------------------------------");
        Student[] allStudent = StudentList.getStudentList();
        if (allStudent.length == 0) {
            System.out.println("当前学生列表为空，没有学生！！！");
            StudentManagement.printSelectFuncUI();
            return;
        }
        System.out.printf("%-10s%-10s%-10s%-10s%n", "学号" + "\t", "姓名" + "\t", "年龄" + "\t", "性别" + "\t");
        for (Student currStudent : allStudent) {
            String currSNum = currStudent.getNum() + "\t";
            String currSName = currStudent.getName() + "\t";
            String currSAge = currStudent.getAge() + "\t";
            String currSGender = currStudent.getGender() + "\t";
            System.out.printf("%-10s%-10s%-10s%-10s%n", currSNum, currSName, currSAge, currSGender);
        }
        StudentManagement.printSelectFuncUI();
    }

    static void exitStudentManagement() {
        System.out.println("----------------------------------------------------");
        System.out.println("是否确定退出？确认退出按 0，取消按 9。");
        int confirmNum = sc.nextInt();
        if (confirmNum == 0) {
            System.out.println("已退出系统！");
        } else {
            StudentManagement.printSelectFuncUI();
        }
    }
}

class StudentList {
    private static Student[] studentList = new Student[0];

    private StudentList() {
    }

    static Student[] getStudentList() {
        return studentList;
    }

    static void setStudentList(Student[] sList) {
        // System.arraycopy(源数组, 源数组起始位置, 目标数组, 目标数组起始位置, 复制长度);
        Student[] newStudentList = new Student[studentList.length + sList.length];
        System.arraycopy(studentList, 0, newStudentList, 0, studentList.length);
        System.arraycopy(sList, 0, newStudentList, studentList.length, sList.length);
        studentList = newStudentList;
    }

    static void cutStudentList(int num) {
        Student[] newAllStudent = new Student[studentList.length - 1];
        int newAllStudentIdx = 0;
        for (Student student : studentList) {
            if (student.getNum() != num) {
                newAllStudent[newAllStudentIdx] = student;
                newAllStudentIdx++;
            }
        }
        studentList = newAllStudent;
    }
}

class Student {
    private int num;
    private String name;
    private int age;
    private String gender;

    Student() {
    }

    Student(int num, String name, int age, String gender) {
        this.num = num;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    int getNum() {
        return this.num;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    String getGender() {
        return this.gender;
    }

    void setNum(int num) {
        this.num = num;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setGender(String gender) {
        this.gender = gender;
    }
}
