/**
 * StringPrompt.java
 * Copyright Shreyas Lad (Penetratingshot) 2019
 *
 * Easily create recursive prompts in the terminal which return String values. Supports one and multiple questions at a time
 */

package com.shreyaslad.util.Prompts;

import java.util.LinkedList;
import java.util.Scanner;

public class StringPrompt {

    private char beginCharacter;

    private String[] questions;
    private String question;
    private LinkedList<String> answers = new LinkedList<>();
    private String answer;

    private String currentQuestion;

    public StringPrompt(char beginCharacter) {
        this.beginCharacter = beginCharacter;
    }

    public void setAndPrintQuestions(String[] questions) {
        Scanner scanner = new Scanner(System.in);

        if (questions.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Questions array cannot be empty");
        }

        try {
            this.questions = questions;

            for (int i = 0; i < questions.length; i++) {
                this.currentQuestion = questions[i];

                String userAnswer;

                do {
                    System.out.println(questions[i]);
                    System.out.print(beginCharacter + " ");
                    userAnswer = scanner.nextLine();
                } while(userAnswer.isEmpty());

                this.answer = userAnswer;
                answers.add(userAnswer);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void setNextQuestion(String question) {
        Scanner scanner = new Scanner(System.in);

        this.question = question;

        String userInput;

        do {
            System.out.println(question);
            System.out.print(beginCharacter + " ");
            userInput = scanner.nextLine();
        } while (userInput.isEmpty());

        this.answer = userInput;
    }

    public LinkedList<String> getAnswers() {
        return answers;
    }

    public String getLastAnswer() {
        return answer;
    }
}
