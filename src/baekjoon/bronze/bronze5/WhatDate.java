package baekjoon.bronze.bronze5;
//������ ��¥��
import java.util.Calendar;
//localdatetime, timezone ����غ���!!
public class WhatDate {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)+1);
        System.out.println(cal.get(Calendar.DATE));
    }
}
