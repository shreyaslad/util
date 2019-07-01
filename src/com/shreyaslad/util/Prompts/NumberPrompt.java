/*
 * Util.NumberPrompt.java
 * Copyright Shreyas Lad (PenetratingShot) 2019
 *
 * Create intuitive prompts which can return any number
 * Returns a generic type or a generic LinkedList
 */

package com.shreyaslad.util.Prompts;

import java.util.LinkedList;
import java.util.Scanner;

public class NumberPrompt<T> {

    private T object;
    private char beginCharacter;

    private LinkedList<T> list = new LinkedList<>();

    public NumberPrompt(char beginCharacter) {
        this.beginCharacter = beginCharacter;
    }

    @SuppressWarnings("unchecked")
    public void createPrompt(String question) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(question);
        System.out.print(beginCharacter + " ");

        object = (T) scanner.nextLine();
    }

    public void createPrompts(String[] questions) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print(beginCharacter + " ");

            object = (T) scanner.nextLine();

            list.add(object);
        }
    }

    public T getLastAnswer() {
        return object;
    }

    public LinkedList<T> getAllAnswers() {
        return list;
    }
}
