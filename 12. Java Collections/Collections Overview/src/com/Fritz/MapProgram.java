package com.Fritz;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {

        Map<String,String> languages = new HashMap<>();

        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "A compile high level, object-oriented, platform independent language");
            System.out.println("Java added succesfully");
        }

        languages.put("Python", "An interpreted, object-oriented, high levell programming language with dynamic ");
        languages.put("Algol", "An algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        System.out.println("-".repeat(40));
        System.out.println(languages.get("Java"));

        System.out.println("-".repeat(40));
        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            System.out.println(languages.put("Java", "This course is about Java"));
        }
        System.out.println(languages.get("Java"));


        System.out.println("=".repeat(40));

//        languages.remove("Lisp");

        if(languages.remove("Algol", "An algorithmic language")) {
            System.out.println("Algol removed!");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        if (languages.replace("Lisp", "Therein lies madness", "A functional programming language with imperative features")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }
//        System.out.println(languages.replace("Scala", "This will not be added"));



        System.out.println("-".repeat(40));
        for(String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
