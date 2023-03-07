package com.Fritz;

public class Main {

    public static void main(String[] args) {

        String var4 = "this is private to main()";

        System.out.println("-".repeat(40));
        Scopecheck scopeInstance = new Scopecheck();
        scopeInstance.useInner();

        Scopecheck.InnerClass innerClass = scopeInstance.new InnerClass();
        System.out.println("var3 is not accesible here " + innerClass.var3);
        System.out.println("scopeInstance private var1 is " + scopeInstance.getVar1());
        System.out.println(var4);

        System.out.println("-".repeat(40));
        scopeInstance.timesTwo();

        System.out.println("-".repeat(40));
        Scopecheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();

        System.out.println("-".repeat(40));
    }
}