package org.server.SOLID.OpenClose;

public class InterviewQuestionProcessor {

    //this is a typical implementation of the loosely coupled system
    //this class knows nothing about the question and its type (!!!)
    //THIS IS PURE ABSTRACTION
    public static void process(InterviewQuestion question) {
        question.execute();
    }
}
