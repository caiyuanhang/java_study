package com.testing.oop.expansionKnowledge.Demo04_objArr;

public class Demo04ObjArrTest02 {
    static void main() {
        Student s1 = new Student("学生1", 100);
        Student s2 = new Student("学生2", 50);
        Student s3 = new Student("学生3", 88);

        Student[] objArr1 = new Student[]{s1, s2, s3};
        Student[] ascObjArr = ascSortStudentArr(objArr1);
        for (Student ascS : ascObjArr) {
            System.out.println("asc-student==" + "name: " + ascS.getName() + ", scope: " + ascS.getScope());
        }

        System.out.println("----------------------------");

        Student[] objArr2 = new Student[]{s1, s2, s3};
        Student[] descObjArr = descSortStudentArr(objArr2);
        for (Student descS : descObjArr) {
            System.out.println("desc-student==" + "name: " + descS.getName() + ", scope: " + descS.getScope());
        }
    }

    public static Student[] ascSortStudentArr(Student[] objArr) {
        for (int j = 0; j < objArr.length - 1; j++) {
            for (int i = 0; i < objArr.length - 1 - j; i++) {
                if (objArr[i].getScope() > objArr[i + 1].getScope()) {
                    Student temp = objArr[i];
                    objArr[i] = objArr[i + 1];
                    objArr[i + 1] = temp;
                }
            }
        }
        return objArr;
    }

    public static Student[] descSortStudentArr(Student[] objArr) {
        for (int j = 0; j < objArr.length - 1; j++) {
            for (int i = 0; i < objArr.length - 1 - j; i++) {
                if (objArr[i].getScope() < objArr[i + 1].getScope()) {
                    Student temp = objArr[i];
                    objArr[i] = objArr[i + 1];
                    objArr[i + 1] = temp;
                }
            }
        }
        return objArr;
    }
}
