package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(">>> ");
        System.out.println("\n"+convert(scanner.nextLine()));
    }

    private static String convert(String input) {

        String[] morseAlphaNumerals = { "   ", ".-", "-...", "-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","-----",".----","..---","...--","....-",".....","-....","--...","---..","----."};
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            output += morseAlphaNumerals[indexOf(input.charAt(i))] + ' ';
        }

        return output;
    }

    private static int indexOf(char c) {

        char[] alphas = {' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'};
        for (int i = 0; i < alphas.length; i++) {
            if (c == alphas[i]) {
                return i;
            }
        }
        return -1;
    }
}
