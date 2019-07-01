# Util

A collection of terminal utilities to aid in development

## Usage

### BooleanPrompt

**Constructor**: 

``` java
public BooleanPrompt(char beginPromptCharacter, boolean defaultChoice)
```

**Methods:**

- `void createPrompts(String[] questions)` Creates a prompt with an array of questions

- `void createPrompt(String question)` Creates a prompt with one question

- `LinkedList<Boolean> getAllAnswers()` Returns a LinkedList<Boolean> of all answers (only for createPrompts())

- `boolean getLastAnswer()` Gets the last answer

**Examples:**

```java
// Creating a prompt with multiple questions

String[] questions = {"Question 1?", "Question 2?", "Question 3?"};
BooleanPrompt booleanPrompt = new BooleanPrompt('>', true);

booleanPrompt.createPromptWithMultipleQuestions(questions);
LinkedList<Boolean> list = booleanPrompt.getAllAnswers();

System.out.println(list);
```

```java
// Creating a prompt with one question

BooleanPrompt booleanPrompt = new BooleanPrompt('>', true);
booleanPrompt.createPromptWithOneQuestion("Continue?");

boolean answer = booleanPrompt.getAnswer();

System.out.println(answer);
```

### StringPrompt

**Constructor:**

```java
StringPrompt(boolean isRecursive, char promptBeginCharacter, String escapeSequence)
```

**Methods:**

- `String getEscapeSequence()` Gets the current escape sequence that the user can input to terminate the program (String)
- `String getQuestion()` Returns the last question that was set by you *(String)*
- `String getAnswer()` Returns the last answer that the user gave *(String)*
- `LinkedList<String> getAllQuestions()` Returns a list of every single question set by you *(LinkedList<String>)*
- `boolean getIsRecursive()` Returns whether the prompt is recursive or single question *(Boolean)*
- `char getBeginCharacter()` Returns the character which signifies a new prompt *(Character)*

- `void createPrompt(String question)` Creates a prompt with one question
- `void createPrompts(String[] questions)` Creates a prompt with multiple questions

**Examples:**

```java
// Creating a prompt with one question

StringPrompt stringPrompt = new StringPrompt(true, '>', "exit");
stringPrompt.createPrompt("What is your favorite color? ");
String answer = stringPrompt.getLastAnswer();
```

```java
// Creating a prompt with multiple questions

StringPrompt stringPrompt = new StringPrompt(true, '>', "exit");
String[] questions = {"question1", "question2", "question3"};

stringPrompt.createPrompts(questions);
LinkedList<String> answers = stringPrompt.getAllAnswers();
```

### NumberPrompt

**Constructor:**

```java
// Creating a prompt with one question

NumberPrompt<Integer> numberPrompt = new NumberPrompt<>();
numberPrompt.createPrompt("Enter a number from 1-10");

int answer = numberPrompt.getLastAnswer;
```

```java
// Creating a prompt with multiple questions

String[] questions = {"question1", "question2", "question3"};
NumberPrompt<Integer> numberPrompt = new NumberPrompt<>();

LinkedList<Integer> answers = numberPrompt.getAllAnswers();
```