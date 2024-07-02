package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello world from Tom");
        for (int x = 0; x < 10; x++) {
            System.out.println(x);
        }
    }

    public static int countthem(String theword, String theletter) {
        int count = 0;
        for (int i = 0; i < theword.length(); i++) {
            if (String.valueOf(theword.charAt(i)).equals(theletter)) {
                count++;
            }
        }
        return count;
    }
}