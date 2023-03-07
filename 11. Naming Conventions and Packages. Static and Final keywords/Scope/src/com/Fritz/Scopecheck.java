package com.Fritz;

public class Scopecheck {

    public int publicVar = 0;
    private int var1 = 1;

    public Scopecheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": privateVar = " + var1);
    }

    public int getVar1() {
        return var1;
    }

    public void timesTwo() {

        int var2 = 2;
        for(int i = 0; i <10; i++) {
            System.out.println(i + " times two is " + i * var2);
        }
//        System.out.println("Value of i is now " + i);
    }

    public void useInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("Var3 from outer class " + innerClass.var3);
    }

    public class InnerClass {

        private int var3 = 3;

        public InnerClass() {
            System.out.println("InnerClass created, var1 is " + var1 +  " and var3 is " + var3);
        }

        public void timesTwo() {

//            Scopecheck.this.timesTwo();
            System.out.println("var1 is still available here: " + var1);
            int privateVar = 2;
            for(int i = 0; i <10; i++) {
                System.out.println(i + " times two is " + i * var3);
            }
        }
    }
}
