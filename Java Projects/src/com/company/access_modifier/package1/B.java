package com.company.access_modifier.package1;
import com.company.access_modifier.package2.*;

public class B {
    private String privatemess = "This is private";
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.publicmes);
    }
}