package com.company;

import java.util.Scanner;

public class MyString {
    private char[] data;

    public MyString(String input){
        data = input.toCharArray();
    }

    public int getLength() {
        return data.length;
    }

    public char getCharAt(int index) {
        return data[index];
    }

    public int indexOf(char character) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == character) {
                return i;
            }
        }
        System.out.println("Character not found.");
        return -1;
    }

    public String getString() {
        return new String(data);
    }

    public void append(char character) {
        char[] old = data;
        data = new char[old.length+1];
        for (int i = 0; i < old.length; i++) {
            data[i] = old[i];
        }
        data[data.length-1] = character;
    }

    public void prepend(char character) {
        char[] old = data;
        data = new char[old.length+1];
        data[0] = character;
        for (int i = 1; i <= old.length; i++) {
            data[i] = old[i-1];
        }
        data[data.length-1] = old[old.length-1];
    }

    public char pop() {
        char[] old = data;
        data = new char[old.length-1];
        for (int i = 0; i < data.length; i++) {
            data[i] = old[i];
        }
        return old[old.length-1];
    }

    public void removeCharAt(int index) {
        char[] old = data;
        data = new char[old.length-1];
        int n = 0;
        for (int i = 0; i < data.length; i++) {
            if (i == index) {
                n++;
            }
]           data[i] = old[n];
            n++;
        }
    }

    public void stripOf(char character) {
        int n = numberOf(character);
        char[] old = data;
        data = new char[old.length-n];
        n = 0;
        for (int i = 0; i < old.length; i++) {
            if (old[i] != character) {
                data[n] = old[i]; // this is unfinished
            }
        }
    }

    public int numberOf(char character) {
        int n = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == character) {
                n++;
            }
        }
        return n;
    }
}
