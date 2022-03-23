package com.tamutanu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);

        Function Student1 = new Function();
        System.out.print("GPAนักเรียนคนที่1");
        System.out.print("/ป้อนหน่วยกิตทั้ง8วิชาลง=");
        Student1.SET_CREDIT(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        Student1.SET_ALL_CREDIT();
        System.out.print("\nป้อนเกรดทั้ง8วิชาลงไป=");
        Student1.SET_ALL_GRADE_SCORE(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        Student1.GPA();

        System.out.print("GPAนักเรียนคนที่2");
        System.out.print("\nป้อนคะแนนเกรดเฉลี่ยและหน่วยกิตรวมทุกวิชา=");
        Function Student2 = new Function(sc.nextDouble(),sc.nextDouble());
        Student2.GPA();

        System.out.print("GPAนักเรียนคนที่3");
        Function Student3 = new Function();
        System.out.print("\nป้อนคะแนนเกรดเฉลี่ยและหน่วยกิตรวมทุกวิชา=");
        Student3.GPA(sc.nextDouble(),sc.nextDouble());

    }
}
