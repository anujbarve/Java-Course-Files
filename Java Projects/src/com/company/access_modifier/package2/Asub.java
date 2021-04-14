package com.company.access_modifier.package2;

import com.company.access_modifier.package1.*;

public class Asub extends A {
    public static void main(String[] args) {
        Asub asub = new Asub();
        System.out.println(asub.protectemes);
    }
}
