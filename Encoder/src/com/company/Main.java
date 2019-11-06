package com.company;

import java.util.Scanner;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();

            System.out.println(encode(input));
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(encode(input)), null);
        }
    }

    public static String encode(String input) {
        String output = "";
        for (char c: input.toCharArray()) {
            output += (char) (219 - (int) c);
        }
        return output;
    }
}
