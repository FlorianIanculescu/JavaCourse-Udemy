package com.Fritz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        System.out.println("-".repeat(30));
        System.out.println("Challenge 1:");
        String challenge1 = "I want a bike.";
        System.out.println(challenge1.matches("I want a bike."));


        System.out.println("-".repeat(30));
        System.out.println("Challenge 2:");
        String challenge2 = "I want a ball.";
        String regExp = "I want a \\w+.";
        System.out.println(challenge1.matches(regExp));
        System.out.println(challenge2.matches(regExp));

        String regExp1 = "I want a (bike|ball).";
        System.out.println(challenge1.matches(regExp1));
        System.out.println(challenge2.matches(regExp1));


        System.out.println("-".repeat(30));
        System.out.println("Challenge 3:");
        String regExp3 = "I want a \\w+.";
        Pattern pattern = Pattern.compile(regExp3);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());

        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());


        System.out.println("-".repeat(30));
        System.out.println("Challenge 4:");
        String challenge4 = "Replace all blanks with underscores";
        System.out.println(challenge4.replaceAll(" ", "_"));

        System.out.println(challenge4.replaceAll("\\s", "_"));


        System.out.println("-".repeat(30));
        System.out.println("Challenge 5:");
        String challange5 = "aaabccccccccdddefffg";
        System.out.println(challange5.matches("[abcdefg]+"));

        System.out.println(challange5.matches("[a-g]+"));


        System.out.println("-".repeat(30));
        System.out.println("Challenge 6:");
        System.out.println(challange5.matches("^a{3}bc{8}d{3}ef{3}g$"));

        System.out.println(challange5.replaceAll("^a{3}bc{8}d{3}ef{3}g$", "REPLACED"));


        System.out.println("-".repeat(30));
        System.out.println("Challenge 7:");
        String challenge7 = "abcd.135";
        System.out.println(challenge7.matches("^[A-z][a-z]+\\.\\d+$"));


        System.out.println("-".repeat(30));
        System.out.println("Challenge 8:");
        String challenge8 = "abcd.135uvqz.7tzik.999";
        Pattern pattern8 = Pattern.compile("[A-Za-z]+\\.(\\d+)");
        Matcher matcher8 = pattern8.matcher(challenge8);
        while(matcher8.find()) {
            System.out.println("Occurrence : " + matcher8.group(1));
        }


        System.out.println("-".repeat(30));
        System.out.println("Challenge 9:");
        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern9 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher9 = pattern9.matcher(challenge9);
        while(matcher9.find()) {
            System.out.println("Occurrence : " + matcher9.group(1));
        }


        System.out.println("-".repeat(30));
        System.out.println("Challenge 10:");
        String challenge10 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern10 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher10 = pattern9.matcher(challenge10);
        while(matcher10.find()) {
            System.out.println("Occurrence : " + "start = " + matcher10.start(1) + " end = " + (matcher10.end(1) - 1));
        }


        System.out.println("-".repeat(30));
        System.out.println("Challenge 11:");
        String challenge11= "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        Pattern pattern11 = Pattern.compile("\\{(.+?)\\}");
        Matcher matcher11 = pattern11.matcher(challenge11);
        while(matcher11.find()) {
            System.out.println("Occurrence : " + matcher11.group(1));
        }


        System.out.println("-".repeat(30));
        System.out.println("Challenge 11.a:");
        String challenge11a= "{0, 2}, {0, 5}, {1, 3}, {2, 4}, {x, y}, {6, 34}, {11, 12}";
        Pattern pattern11a = Pattern.compile("\\{(\\d+, \\d+)\\}");
        Matcher matcher11a = pattern11a.matcher(challenge11a);
        while(matcher11a.find()) {
            System.out.println("Occurrence : " + matcher11a.group(1));
        }


        System.out.println("-".repeat(30));
        System.out.println("Challenge 12:");
        String challenge12 = "11111";
        System.out.println(challenge12.matches("^\\d{5}$"));


        System.out.println("-".repeat(30));
        System.out.println("Challenge 13:");
        String challenge13 = "11111-1111";
        System.out.println(challenge13.matches("^\\d{5}-\\d{4}$"));


        System.out.println("-".repeat(30));
        System.out.println("Challenge 14:");
        System.out.println(challenge12.matches("\\d{5}(-\\d{4})?$"));
        System.out.println(challenge13.matches("\\d{5}(-\\d{4})?$"));
    }
}